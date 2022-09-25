package p5488io.grpc.p5527g.p5528a;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.g.a.s */
/* compiled from: PG */
public final class C70806s {

    /* renamed from: a */
    public static final String[] f188832a = new String[0];

    /* renamed from: b */
    public static final Charset f188833b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static List m103573a(Object[] objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* renamed from: b */
    public static Object[] m103574b(Class cls, Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr2[i];
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
                i++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }
}
