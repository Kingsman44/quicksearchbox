package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.aa.m */
/* compiled from: PG */
public final class C89057m extends C89021as {
    public C89057m(C90457d dVar) {
        super(dVar);
    }

    /* renamed from: d */
    public static C60870cx m144852d(C60870cx cxVar) {
        return C60922j.m93045h(cxVar, new C89056l(), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C89053i mo83034a() {
        return (C89053i) super.mo82997b();
    }

    /* renamed from: b */
    public final /* synthetic */ C89068x mo82997b() {
        return (C89053i) super.mo82997b();
    }

    /* renamed from: c */
    public final C89021as mo82998c(List list) {
        return new C89057m(this, list);
    }

    /* renamed from: e */
    public final String mo83035e() {
        return new String(mo83036f(), C89033bd.m144789b(mo82999g().mo83000a("Content-Type", (String) null)));
    }

    /* renamed from: f */
    public final byte[] mo83036f() {
        try {
            ByteBuffer c = ((C89053i) super.mo82997b()).mo83032c();
            C58838bb.m90883r(c.hasArray());
            boolean z = true;
            C58838bb.m90883r(c.arrayOffset() == 0);
            if (c.position() != 0) {
                z = false;
            }
            C58838bb.m90883r(z);
            if (c.array().length == c.remaining()) {
                return c.array();
            }
            return Arrays.copyOf(c.array(), c.remaining());
        } catch (C90457d e) {
            throw e;
        } catch (IOException e2) {
            throw new C90457d((Throwable) e2, (int) C89885b.HTTP_TAKE_CONTENTS_IO_EXCEPTION_VALUE);
        }
    }

    private C89057m(C89057m mVar, List list) {
        super((C89021as) mVar, list);
    }

    public C89057m(C89013ak akVar) {
        super(akVar);
    }

    public C89057m(C89022at atVar, C89068x xVar) {
        super(atVar, xVar);
    }
}
