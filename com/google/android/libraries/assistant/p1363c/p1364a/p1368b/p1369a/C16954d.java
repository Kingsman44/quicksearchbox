package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import android.net.Uri;
import androidx.media3.common.C2646bh;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1367b.C16939a;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.p10890h.p10891a.p10892a.C146553h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.d */
/* compiled from: PG */
public final class C16954d implements C146553h {

    /* renamed from: b */
    private static final C59071e f49539b = C59071e.m91332i("com.google.android.libraries.assistant.c.a.b.a.d");

    /* renamed from: a */
    public final C2646bh f49540a;

    /* renamed from: c */
    private final C16939a f49541c;

    /* renamed from: d */
    private final Executor f49542d;

    public C16954d(C2646bh bhVar, C16939a aVar, Executor executor) {
        this.f49540a = bhVar;
        this.f49541c = aVar;
        this.f49542d = executor;
    }

    /* renamed from: a */
    public final long mo23146a() {
        return 257024;
    }

    /* renamed from: b */
    public final void mo23147b(boolean z) {
        this.f49542d.execute(C47810es.m84977q(new C16953c(this, z)));
    }

    /* renamed from: d */
    public final void mo23148d(Uri uri, boolean z) {
        String uri2 = uri.toString();
        int i = 0;
        while (true) {
            if (i >= this.f49540a.mo6255W()) {
                ((C59052c) ((C59052c) f49539b.mo56226d()).mo56372aa(42567)).mo56386p("findMediaItemIndex: no match found");
                i = -1;
                break;
            }
            C16980d a = C16973w.m34074a(this.f49540a.mo6257ab(i));
            if (a != null && uri2.equals(a.f49603a)) {
                break;
            }
            i++;
        }
        if (i >= 0 && i < this.f49540a.mo6255W()) {
            this.f49542d.execute(C47810es.m84977q(new C16952b(this, i)));
            mo23147b(z);
        }
    }

    /* renamed from: e */
    public final void mo23149e(String str, boolean z) {
        Optional a;
        C16939a aVar = this.f49541c;
        if (aVar != null && (a = aVar.mo21377a(str)) != null && !a.isEmpty() && !C58837ba.m90859h((String) a.get())) {
            mo23148d(Uri.parse((String) a.get()), z);
        }
    }

    /* renamed from: f */
    public final void mo23150f(String str, boolean z) {
        Optional b;
        C16939a aVar = this.f49541c;
        if (aVar != null && (b = aVar.mo21378b()) != null && !b.isEmpty() && !C58837ba.m90859h((String) b.get())) {
            mo23148d(Uri.parse((String) b.get()), z);
        }
    }

    /* renamed from: j */
    public final boolean mo23151j(C2646bh bhVar, String str) {
        return false;
    }
}
