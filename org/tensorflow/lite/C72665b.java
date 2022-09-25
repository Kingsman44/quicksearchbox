package org.tensorflow.lite;

/* renamed from: org.tensorflow.lite.b */
/* compiled from: PG */
final class C72665b {
    /* renamed from: a */
    static String m107477a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    return "float";
                case 1:
                    return "int";
                case 2:
                case 7:
                    return "byte";
                case 3:
                    return "long";
                case 4:
                    return "string";
                case 5:
                    return "bool";
                case 6:
                    return "short";
                default:
                    throw new IllegalArgumentException("DataType error: DataType " + C72664a.m107475a(i) + " is not supported yet");
            }
        } else {
            throw null;
        }
    }
}
