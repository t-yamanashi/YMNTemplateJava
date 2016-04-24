/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymn;

/**
 *
 * @author user
 */
public class TextConvert {

        /// <summary>
        /// 表示名
        /// </summary>
        private String _dispName = "";

        /// <summary>
        /// エンコーディング
        /// </summary>
        //private Encoding _encodingObject = null;

        /// <summary>
        /// 表示名
        /// </summary>
        public String getDispName(){
            return _dispName;
        }

        /// <summary>
        /// エンコーディング
        /// </summary>
        //public Encoding getEncodingObject(){
        //
        //        return _encodingObject;
        //}

//        /// <summary>
//        /// ファイルフォーマット
//        /// </summary>
//        /// <param name="dispname"></param>
//        /// <param name="encoding"></param>
//        public void FileFormat(String dispname/*,  Encoding encoding */)
//        {
//            _dispName = dispname;
//            //_encodingObject = encoding;
//        }

//        /// <summary>
//        /// ファイルフォーマット一覧取得
//        /// </summary>
//        public static List<FileFormat> GetFileFormatList()
//        {
//            List<FileFormat> list = new List<FileFormat>();
//            list.Add(new FileFormat("Shift-JIS", Encoding.GetEncoding("Shift_JIS")));
//            list.Add(new FileFormat("UTF8", Encoding.UTF8));
//            return list;
//        }
    
}
