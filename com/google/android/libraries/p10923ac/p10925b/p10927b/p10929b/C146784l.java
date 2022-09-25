package com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b;

import com.google.android.libraries.p10923ac.p10925b.p10933d.C146823b;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146824c;
import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.p4566l.C60190da;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.ac.b.b.b.l */
/* compiled from: PG */
public final class C146784l {

    /* renamed from: a */
    public static final C58528ij f396331a = C58528ij.m90012L(C60190da.BAD_AUTHENTICATION, C60190da.NETWORK_ERROR, C60190da.AUTH_INTERNAL_ERROR);

    /* renamed from: a */
    static C60190da m239159a(Exception exc) {
        HashSet hashSet = new HashSet();
        for (Throwable th : C58887cx.m90978e(exc)) {
            hashSet.add(th.getClass());
        }
        if ((C58887cx.m90977d(exc) instanceof IOException) && exc.getMessage() != null && exc.getMessage().contains("NetworkError")) {
            return C60190da.NETWORK_ERROR;
        }
        if (C58887cx.m90977d(exc) instanceof IOException) {
            return C60190da.IO_EXCEPTION;
        }
        if (hashSet.contains(C146824c.class) && exc.getMessage() != null && exc.getMessage().contains("BadAuthentication")) {
            return C60190da.BAD_AUTHENTICATION;
        }
        if (hashSet.contains(C146824c.class)) {
            return C60190da.USER_RECOVERABLE_AUTH_EXCEPTION;
        }
        if (hashSet.contains(C146823b.class) && exc.getMessage() != null && exc.getMessage().contains("InternalError")) {
            return C60190da.AUTH_INTERNAL_ERROR;
        }
        if (hashSet.contains(C146823b.class)) {
            return C60190da.AUTH_EXCEPTION;
        }
        return C60190da.UNDEFINED;
    }
}
