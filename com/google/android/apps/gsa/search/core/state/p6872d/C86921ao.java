package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86796k;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.microdetection.C92532d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.IllegalFormatException;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.ao */
/* compiled from: PG */
public final class C86921ao extends C86898ct implements C86796k {

    /* renamed from: c */
    private static final C59071e f234737c = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.ao");

    /* renamed from: a */
    public int f234738a;

    /* renamed from: b */
    public long f234739b = 0;

    /* renamed from: d */
    private final C68214a f234740d;

    /* renamed from: e */
    private final SharedPreferences f234741e;

    /* renamed from: f */
    private final C84474e f234742f;

    /* renamed from: g */
    private String f234743g = BuildConfig.FLAVOR;

    /* renamed from: h */
    private String f234744h;

    /* renamed from: i */
    private String f234745i;

    /* renamed from: j */
    private String f234746j;

    /* renamed from: k */
    private String f234747k;

    /* renamed from: l */
    private String f234748l;

    /* renamed from: m */
    private final Resources f234749m;

    /* renamed from: n */
    private boolean f234750n;

    public C86921ao(SharedPreferences sharedPreferences, C68214a aVar, C68214a aVar2, Resources resources, C84474e eVar) {
        super(aVar2, 4);
        this.f234741e = sharedPreferences;
        this.f234740d = aVar;
        this.f234749m = resources;
        this.f234742f = eVar;
    }

    /* renamed from: n */
    private final String m140209n() {
        String x = ((C86124t) this.f234740d.mo27525b()).mo79758x(C89972ak.f246553aa);
        return TextUtils.isEmpty(x) ? this.f234749m.getString(R.string.search_box_hint) : x;
    }

    /* renamed from: o */
    private final String m140210o(int i, boolean z) {
        C58833ax axVar;
        if (this.f234742f.mo78058C()) {
            return this.f234749m.getString(R.string.search_box_hint);
        }
        if ((i & 2) != 0) {
            if (this.f234747k == null) {
                this.f234747k = this.f234749m.getString(R.string.search_box_hint);
            }
            return this.f234747k;
        } else if (!C89331a.m145281b(i)) {
            if (!z) {
                if (this.f234745i == null) {
                    this.f234745i = m140209n();
                }
                axVar = C58833ax.m90834k(this.f234745i);
            } else if (((C86124t) this.f234740d.mo27525b()).mo79746e(C89985ax.f246657K)) {
                if (this.f234748l == null) {
                    this.f234748l = m140211p();
                }
                axVar = C58833ax.m90834k(this.f234748l);
            } else {
                axVar = C58836b.f156633a;
            }
            return (String) axVar.mo56109e(BuildConfig.FLAVOR);
        } else if (this.f234750n) {
            if (this.f234746j == null) {
                this.f234746j = BuildConfig.FLAVOR;
            }
            return this.f234746j;
        } else if (!z) {
            if (this.f234745i == null) {
                this.f234745i = m140209n();
            }
            return this.f234745i;
        } else if (((C86124t) this.f234740d.mo27525b()).mo79746e(C89985ax.f246657K)) {
            if (this.f234748l == null) {
                this.f234748l = m140211p();
            }
            return this.f234748l;
        } else {
            if (this.f234744h == null) {
                this.f234744h = this.f234749m.getString(R.string.say_hotword);
            }
            return this.f234744h;
        }
    }

    /* renamed from: p */
    private final String m140211p() {
        String x = ((C86124t) this.f234740d.mo27525b()).mo79758x(C89985ax.f246677aD);
        return TextUtils.isEmpty(x) ? this.f234749m.getString(R.string.search_box_hint) : x;
    }

    /* renamed from: a */
    public final void mo80464a(String str) {
        this.f234745i = null;
        if (!TextUtils.isEmpty(str)) {
            this.f234745i = str;
        }
        mo80591ar();
    }

    /* renamed from: b */
    public final String mo80465b() {
        return m140210o(this.f234738a, false);
    }

    /* renamed from: e */
    public final String mo80568e() {
        String o = m140210o(this.f234738a, true);
        try {
            if (TextUtils.isEmpty(this.f234743g)) {
                return String.format(o, new Object[0]);
            }
            return String.format(o, new Object[]{this.f234743g});
        } catch (IllegalFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f234737c.mo56226d()).mo56382g(e)).mo56372aa(9140)).mo56354G("getHintForWidget: hint formatting failed. hintTemplate=\"%s\",mHotwordPrompt=\"%s\"", o, this.f234743g);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: g */
    public final String mo80569g() {
        if (this.f234742f.mo78059D()) {
            return BuildConfig.FLAVOR;
        }
        return mo80568e();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HintState");
        fVar.mo85279c("Hint mode").mo85276a(C90752i.m148229c(String.valueOf(this.f234738a)));
        fVar.mo85279c("Hotword text").mo85276a(C90752i.m148229c(this.f234743g));
    }

    /* renamed from: j */
    public final boolean mo80571j(String str) {
        if (this.f234743g.equals(str)) {
            return false;
        }
        this.f234743g = str;
        return true;
    }

    /* renamed from: k */
    public final boolean mo80572k(String str) {
        if (TextUtils.equals(str, this.f234741e.getString("search_widget_computed_hint", BuildConfig.FLAVOR))) {
            return false;
        }
        this.f234741e.edit().putString("search_widget_computed_hint", str).apply();
        return true;
    }

    /* renamed from: m */
    public final boolean mo80573m(C86962n nVar, C86938be beVar) {
        int i = this.f234738a;
        this.f234738a = 0;
        if (nVar.f234889b) {
            this.f234738a = 2;
        }
        if (beVar.mo80589Q()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!beVar.mo80490C()) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (!((C89994f) beVar.f234788b.mo27525b()).mo83819h()) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else if (!beVar.f234795i.mo17534a()) {
            C58976aa aaVar4 = C58975e.f156826a;
        } else if (!beVar.mo80586N() && !beVar.f234799m) {
            C58976aa aaVar5 = C58975e.f156826a;
        } else if (beVar.mo80587O()) {
            C58976aa aaVar6 = C58975e.f156826a;
        } else {
            if (beVar.f234789c.mo79746e(C90120fr.f250837d)) {
                C58976aa aaVar7 = C58975e.f156826a;
            } else if (beVar.mo80589Q()) {
                C58976aa aaVar8 = C58975e.f156826a;
            } else if (!beVar.mo80490C()) {
                C58976aa aaVar9 = C58975e.f156826a;
            } else if (((C92532d) beVar.f234793g.mo27525b()).mo85077a() >= 2) {
                C58976aa aaVar10 = C58975e.f156826a;
            } else {
                long j = beVar.f234792f.getLong("first_hotword_hint_shown_at", 0);
                long b = beVar.f234790d.mo26870b();
                if (j == 0) {
                    beVar.f234792f.edit().putLong("first_hotword_hint_shown_at", beVar.f234790d.mo26870b()).apply();
                } else if (b - j > beVar.f234789c.mo79743a(C90120fr.f250796aI) * 86400000) {
                    C58976aa aaVar11 = C58975e.f156826a;
                }
                C58976aa aaVar12 = C58975e.f156826a;
            }
            this.f234738a |= 1;
        }
        return i != this.f234738a;
    }

    /* renamed from: i */
    public final void mo80570i(boolean z) {
        String str;
        if (this.f234750n != z) {
            this.f234750n = z;
            if (z) {
                str = BuildConfig.FLAVOR;
            } else {
                str = mo80568e();
            }
            if (mo80572k(str)) {
                mo80591ar();
            }
        }
    }
}
