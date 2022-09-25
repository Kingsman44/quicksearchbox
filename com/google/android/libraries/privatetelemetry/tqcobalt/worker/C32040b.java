package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import android.os.Build;
import android.util.Base64;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32012f;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32013g;
import com.google.android.p10713e.C142537c;
import com.google.android.p10713e.C142538d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63088z;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.b */
/* compiled from: PG */
final class C32040b {
    /* renamed from: a */
    static C142538d m59703a(C32027a aVar, C32012f fVar, C142538d dVar, String str, List list) {
        C142537c cVar = (C142537c) C142538d.f386774q.createBuilder(dVar);
        C63088z b = m59704b(fVar.mo37779c());
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386782g = b;
        String d = m59706d(aVar.f86078c);
        cVar.copyOnWrite();
        d.getClass();
        ((C142538d) cVar.instance).f386783h = d;
        String d2 = m59706d(aVar.f86080e);
        cVar.copyOnWrite();
        d2.getClass();
        ((C142538d) cVar.instance).f386787l = d2;
        String c = m59705c(aVar.f86076a);
        cVar.copyOnWrite();
        c.getClass();
        ((C142538d) cVar.instance).f386785j = c;
        String d3 = m59706d(aVar.f86079d);
        cVar.copyOnWrite();
        d3.getClass();
        ((C142538d) cVar.instance).f386784i = d3;
        String c2 = m59705c(aVar.f86077b);
        cVar.copyOnWrite();
        c2.getClass();
        ((C142538d) cVar.instance).f386786k = c2;
        String str2 = Build.VERSION.RELEASE;
        cVar.copyOnWrite();
        str2.getClass();
        ((C142538d) cVar.instance).f386788m = str2;
        String str3 = Build.BOARD;
        cVar.copyOnWrite();
        str3.getClass();
        ((C142538d) cVar.instance).f386789n = str3;
        cVar.copyOnWrite();
        str.getClass();
        ((C142538d) cVar.instance).f386791p = str;
        cVar.copyOnWrite();
        C142538d dVar2 = (C142538d) cVar.instance;
        C62964ck ckVar = dVar2.f386790o;
        if (!ckVar.mo58948c()) {
            dVar2.f386790o = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll((Iterable) list, (List) dVar2.f386790o);
        return (C142538d) cVar.build();
    }

    /* renamed from: b */
    public static C63088z m59704b(C32013g gVar) {
        return C63088z.m96139A(Base64.decode(gVar.mo37782b(), 0));
    }

    /* renamed from: c */
    public static String m59705c(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdir()) {
            return file.getAbsolutePath();
        }
        throw new IOException("Cobalt: couldn't create dir ".concat(str));
    }

    /* renamed from: d */
    public static String m59706d(String str) {
        File file = new File(str);
        if (file.exists() || file.createNewFile()) {
            return file.getAbsolutePath();
        }
        throw new IOException("Cobalt: couldn't create file ".concat(str));
    }
}
