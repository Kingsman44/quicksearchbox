package com.google.android.libraries.lens.view.p2148l;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4711m.C62632i;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.lens.view.l.h */
/* compiled from: PG */
public abstract class C27228h {

    /* renamed from: h */
    public static final C27228h f74491h = m50544i().mo32662a();

    /* renamed from: i */
    public static C27226f m50544i() {
        C27221a aVar = new C27221a();
        aVar.mo32665d(1);
        return aVar;
    }

    /* renamed from: a */
    public abstract C27226f mo32667a();

    /* renamed from: b */
    public abstract C58833ax mo32668b();

    /* renamed from: c */
    public abstract C58833ax mo32669c();

    /* renamed from: d */
    public abstract C58833ax mo32670d();

    /* renamed from: e */
    public abstract C58833ax mo32671e();

    /* renamed from: f */
    public abstract C58833ax mo32673f();

    /* renamed from: g */
    public abstract C58833ax mo32674g();

    /* renamed from: h */
    public abstract int mo32675h();

    /* renamed from: j */
    public final C58833ax mo32727j(C27232l lVar, String str) {
        if (mo32668b().mo56113h()) {
            if (!mo32669c().mo56113h() || (!C62632i.m94820e(lVar.mo32701h()) && (!C62632i.m94822g(lVar.mo32701h()) || !lVar.mo32699f().mo56113h() || !((String) lVar.mo32699f().mo56107c()).equals(str)))) {
                return C58833ax.m90834k(C27227g.BITMAP);
            }
            return C58833ax.m90834k(C27227g.FIFE_URL);
        } else if (!mo32674g().mo56113h() || ((Uri) mo32674g().mo56107c()).equals(Uri.EMPTY)) {
            return mo32670d().mo56113h() ? C58833ax.m90834k(C27227g.IMAGE_BYTES) : C58836b.f156633a;
        } else {
            return C58833ax.m90834k(C27227g.CONTENT_URI);
        }
    }

    /* renamed from: k */
    public final InputStream mo32728k(ContentResolver contentResolver) {
        if (mo32674g().mo56113h()) {
            return new BufferedInputStream(C23335a.m43765b(contentResolver, (Uri) mo32674g().mo56107c()));
        }
        if (mo32670d().mo56113h()) {
            return new ByteArrayInputStream((byte[]) mo32670d().mo56107c());
        }
        throw new AssertionError("ExternalImageData contains no image data!");
    }
}
