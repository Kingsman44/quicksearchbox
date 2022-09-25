package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.common.text.C24129e;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27981d;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27965u;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4172bg.p4174b.C55733v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.ak */
/* compiled from: PG */
public final class C27920ak {

    /* renamed from: a */
    public static final C58974d f76042a = C58974d.m91135i("TranslationHelper");

    /* renamed from: b */
    public final C27965u f76043b;

    /* renamed from: c */
    public final C27981d f76044c;

    /* renamed from: d */
    public final C27940n f76045d;

    /* renamed from: e */
    public final Executor f76046e;

    /* renamed from: f */
    public final C37215b f76047f;

    /* renamed from: g */
    public final C65603f f76048g;

    /* renamed from: h */
    public final boolean f76049h;

    /* renamed from: i */
    public final boolean f76050i;

    /* renamed from: j */
    public final C25043ao f76051j;

    /* renamed from: k */
    public C60870cx f76052k;

    /* renamed from: l */
    public C58833ax f76053l;

    /* renamed from: m */
    public C58833ax f76054m;

    /* renamed from: n */
    public C58833ax f76055n;

    /* renamed from: o */
    public C58833ax f76056o;

    /* renamed from: p */
    public C58833ax f76057p;

    public C27920ak(C27965u uVar, C27981d dVar, C27940n nVar, Executor executor, C37215b bVar, C65603f fVar, boolean z, boolean z2, C25043ao aoVar) {
        C58836b bVar2 = C58836b.f156633a;
        this.f76053l = bVar2;
        this.f76054m = bVar2;
        this.f76055n = bVar2;
        this.f76056o = bVar2;
        this.f76057p = bVar2;
        this.f76043b = uVar;
        this.f76045d = nVar;
        this.f76046e = executor;
        this.f76044c = dVar;
        this.f76047f = bVar;
        this.f76048g = fVar;
        this.f76049h = z;
        this.f76051j = aoVar;
        this.f76050i = z2;
    }

    /* renamed from: a */
    public final void mo33372a(String str) {
        C25043ao aoVar;
        if (this.f76050i && (aoVar = this.f76051j) != null && str != null) {
            ((C19567d) aoVar.f68265q.mo6453a()).mo24822a(1, str, Boolean.valueOf(this.f76043b.mo33428f()));
        }
    }

    /* renamed from: b */
    public final void mo33373b(C58833ax axVar, C58833ax axVar2) {
        this.f76056o = axVar;
        this.f76054m = axVar2;
        if (axVar.mo56113h() && this.f76054m.mo56113h() && mo33377f()) {
            ((C58970a) ((C58970a) f76042a.mo56224b()).mo56372aa(50005)).mo56354G("Maybe initialize Translate engine: %s -> %s", this.f76056o.mo56107c(), this.f76054m.mo56107c());
            this.f76043b.mo33424b((String) this.f76056o.mo56107c(), (String) this.f76054m.mo56107c());
        }
    }

    /* renamed from: c */
    public final void mo33374c() {
        this.f76043b.mo33425c();
    }

    /* renamed from: d */
    public final void mo33375d() {
        this.f76043b.mo33426d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33376e(String str) {
        if (mo33380i()) {
            if (str == null || !C24129e.m44831e(str)) {
                this.f76055n = C58836b.f156633a;
                return;
            }
            C58833ax j = C58833ax.m90833j(str);
            this.f76055n = j;
            mo33373b(j, this.f76054m);
        }
    }

    /* renamed from: f */
    public final boolean mo33377f() {
        if (!this.f76056o.mo56113h() || !this.f76054m.mo56113h()) {
            return false;
        }
        return this.f76043b.mo33427e((String) this.f76056o.mo56107c(), (String) this.f76054m.mo56107c());
    }

    /* renamed from: g */
    public final boolean mo33378g(String str) {
        return this.f76043b.mo33427e(str);
    }

    /* renamed from: h */
    public final boolean mo33379h() {
        return this.f76043b.mo33428f();
    }

    /* renamed from: i */
    public final boolean mo33380i() {
        return this.f76053l.mo56113h() && "auto".equals(this.f76053l.mo56107c());
    }

    /* renamed from: j */
    public final void mo33381j(C55733v vVar) {
        C58833ax axVar;
        C58833ax axVar2;
        if (mo33380i()) {
            if (!mo33380i()) {
                axVar = C58836b.f156633a;
            } else if ((vVar.f147072a & 512) != 0) {
                if (!C24129e.f65886b.containsKey(vVar.f147073b)) {
                    axVar = C58833ax.m90834k(C56299cz.SCRIPT_NOT_SUPPORTED);
                } else if (C24129e.m44832f(vVar.f147073b)) {
                    String[] strArr = (String[]) C24129e.m44829c(vVar.f147073b).mo56109e(new String[0]);
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            axVar2 = C58836b.f156633a;
                            break;
                        }
                        String str = strArr[i];
                        if (mo33378g(str)) {
                            axVar2 = C58833ax.m90834k(str);
                            break;
                        }
                        i++;
                    }
                    if (axVar2.mo56113h()) {
                        axVar = C58833ax.m90834k(C56299cz.SUCCESS);
                    } else {
                        axVar = C58833ax.m90834k(C56299cz.LANGUAGE_NOT_DOWNLOADED);
                    }
                } else if ((vVar.f147072a & 2048) == 0 || !C24129e.m44831e(vVar.f147075d) || !((String) C24129e.m44828b(vVar.f147075d).mo56107c()).equals(vVar.f147073b)) {
                    axVar = C58833ax.m90834k(C56299cz.LANGUAGE_NOT_SUPPORTED);
                } else if (!mo33378g(C24129e.m44830d(vVar.f147075d))) {
                    axVar = C58833ax.m90834k(C56299cz.LANGUAGE_NOT_DOWNLOADED);
                } else {
                    axVar = C58833ax.m90834k(C56299cz.SUCCESS);
                }
            } else {
                axVar = C58833ax.m90834k(C56299cz.NO_SCRIPT);
            }
            this.f76057p = axVar;
            if (axVar.mo56113h()) {
                C56299cz czVar = C56299cz.UNKNOWN;
                int ordinal = ((C56299cz) this.f76057p.mo56107c()).ordinal();
                if (ordinal == 1 || ordinal == 2 || ordinal == 5) {
                    mo33376e((String) null);
                    return;
                }
                String[] strArr2 = (String[]) C24129e.m44829c(vVar.f147073b).mo56107c();
                if (strArr2.length == 1) {
                    String str2 = strArr2[0];
                    String str3 = vVar.f147073b;
                    mo33376e(C24129e.m44830d(str2));
                    return;
                }
                mo33376e(C24129e.m44830d(vVar.f147075d));
            }
        }
    }
}
