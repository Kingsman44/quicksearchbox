package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.core.p.ag */
/* compiled from: PG */
public final class C86197ag {

    /* renamed from: a */
    public final SettableFuture f232931a = new SettableFuture();

    /* renamed from: b */
    private final String f232932b;

    /* renamed from: c */
    private final boolean f232933c;

    public C86197ag(String str, boolean z) {
        this.f232932b = str;
        this.f232933c = z;
    }

    /* renamed from: a */
    public final void mo79831a() {
        this.f232931a.cancel(false);
    }

    /* renamed from: b */
    public final boolean mo79832b(Object obj) {
        if (obj == null) {
            ((C59052c) ((C59052c) C86198ah.f232934a.mo56226d()).mo56372aa(7746)).mo56389s("Ignoring null value for %s", this.f232932b);
            return false;
        } else if (this.f232931a.mo57356n(C58833ax.m90834k(obj))) {
            return true;
        } else {
            if (C90877ak.m148480n(this.f232931a)) {
                if (!((C58833ax) C90877ak.m148474h(this.f232931a)).mo56113h()) {
                    ((C59052c) ((C59052c) C86198ah.f232934a.mo56226d()).mo56372aa(7750)).mo56389s("Tried to set absent field to present: %s", this.f232932b);
                    int i = C90755l.f253831a;
                } else if (!this.f232933c) {
                    ((C59052c) ((C59052c) C86198ah.f232934a.mo56226d()).mo56372aa(7749)).mo56354G("Received multiple values for %s, value = %s", this.f232932b, obj);
                    int i2 = C90755l.f253831a;
                } else if (!C58832aw.m90831a(C90918bo.m148515b(this.f232931a), obj)) {
                    ((C59052c) ((C59052c) C86198ah.f232934a.mo56226d()).mo56372aa(7748)).mo56359L("Received multiple unequal values for %s, original = %s, new = %s", this.f232932b, C90918bo.m148515b(this.f232931a), obj);
                    int i3 = C90755l.f253831a;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo79833c() {
        this.f232931a.mo57356n(C58836b.f156633a);
    }
}
