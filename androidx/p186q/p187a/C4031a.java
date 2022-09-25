package androidx.p186q.p187a;

/* renamed from: androidx.q.a.a */
/* compiled from: PG */
public final class C4031a {
    /* renamed from: a */
    public static final void m11550a(C4055j jVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                byte[] bArr = objArr[i];
                i++;
                if (bArr == null) {
                    jVar.mo8205f(i);
                } else if (bArr instanceof byte[]) {
                    jVar.mo8201c(i, bArr);
                } else if (bArr instanceof Float) {
                    jVar.mo8203d(i, (double) ((Number) bArr).floatValue());
                } else if (bArr instanceof Double) {
                    jVar.mo8203d(i, ((Number) bArr).doubleValue());
                } else if (bArr instanceof Long) {
                    jVar.mo8204e(i, ((Number) bArr).longValue());
                } else if (bArr instanceof Integer) {
                    jVar.mo8204e(i, (long) ((Number) bArr).intValue());
                } else if (bArr instanceof Short) {
                    jVar.mo8204e(i, (long) ((Number) bArr).shortValue());
                } else if (bArr instanceof Byte) {
                    jVar.mo8204e(i, (long) ((Number) bArr).byteValue());
                } else if (bArr instanceof String) {
                    jVar.mo8206g(i, (String) bArr);
                } else if (bArr instanceof Boolean) {
                    jVar.mo8204e(i, true != ((Boolean) bArr).booleanValue() ? 0 : 1);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + bArr + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }
}
