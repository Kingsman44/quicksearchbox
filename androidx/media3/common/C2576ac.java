package androidx.media3.common;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.media3.common.ac */
/* compiled from: PG */
public final class C2576ac {

    /* renamed from: a */
    public String f7103a;

    /* renamed from: b */
    public Uri f7104b;

    /* renamed from: c */
    public C2580ag f7105c;

    /* renamed from: d */
    public C58485gu f7106d;

    /* renamed from: e */
    public Object f7107e;

    /* renamed from: f */
    public C2582ai f7108f;

    /* renamed from: g */
    private final C2577ad f7109g;

    /* renamed from: h */
    private List f7110h;

    /* renamed from: i */
    private C2593at f7111i;

    /* renamed from: j */
    private final C2586am f7112j;

    public C2576ac() {
        this.f7109g = new C2577ad();
        this.f7105c = new C2580ag();
        this.f7110h = Collections.emptyList();
        this.f7106d = C58485gu.m89845m();
        this.f7108f = new C2582ai();
        this.f7112j = C2586am.f7139a;
    }

    /* renamed from: a */
    public final C2590aq mo6082a() {
        C2585al alVar;
        C2580ag agVar = this.f7105c;
        Uri uri = agVar.f7120b;
        Uri uri2 = this.f7104b;
        if (uri2 != null) {
            UUID uuid = agVar.f7119a;
            alVar = new C2585al(uri2, this.f7110h, this.f7106d, this.f7107e);
        } else {
            alVar = null;
        }
        C2585al alVar2 = alVar;
        String str = this.f7103a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        C2579af afVar = new C2579af(this.f7109g);
        C2583aj ajVar = new C2583aj(this.f7108f);
        C2593at atVar = this.f7111i;
        if (atVar == null) {
            atVar = C2593at.f7182a;
        }
        return new C2590aq(str2, afVar, alVar2, ajVar, atVar, this.f7112j);
    }

    /* renamed from: b */
    public final void mo6083b(String str) {
        this.f7104b = str == null ? null : Uri.parse(str);
    }

    public C2576ac(C2590aq aqVar) {
        this();
        this.f7109g = new C2577ad(aqVar.f7158g);
        this.f7103a = aqVar.f7153b;
        this.f7111i = aqVar.f7157f;
        this.f7108f = new C2582ai(aqVar.f7156e);
        this.f7112j = aqVar.f7159h;
        C2584ak akVar = aqVar.f7154c;
        if (akVar != null) {
            this.f7104b = akVar.f7131a;
            this.f7110h = akVar.f7135e;
            this.f7106d = akVar.f7137g;
            this.f7107e = akVar.f7138h;
            this.f7105c = new C2580ag();
        }
    }
}
