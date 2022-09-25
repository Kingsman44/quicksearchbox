package com.google.android.hotword.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.gms.common.C143701ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class HotwordService extends C146583a {

    /* renamed from: a */
    public static final C59071e f395906a = C59071e.m91332i("com.google.android.hotword.service.HotwordService");

    /* renamed from: b */
    public final Set f395907b;

    /* renamed from: c */
    public C87673aa f395908c;

    /* renamed from: d */
    public boolean f395909d;

    /* renamed from: e */
    public C68214a f395910e;

    /* renamed from: f */
    public C68214a f395911f;

    /* renamed from: g */
    public C68214a f395912g;

    /* renamed from: h */
    public C68214a f395913h;

    /* renamed from: i */
    public C68214a f395914i;

    /* renamed from: j */
    public C68214a f395915j;

    /* renamed from: k */
    public C87677ae f395916k;

    /* renamed from: l */
    public String f395917l;

    /* renamed from: m */
    public C68214a f395918m;

    /* renamed from: n */
    public SharedPreferences f395919n;

    /* renamed from: o */
    public C68214a f395920o;

    /* renamed from: p */
    public C68214a f395921p;

    /* renamed from: q */
    public C68214a f395922q;

    /* renamed from: r */
    public C68214a f395923r;

    /* renamed from: s */
    public C68214a f395924s;

    /* renamed from: t */
    public Context f395925t;

    /* renamed from: u */
    public C143701ac f395926u;

    /* renamed from: v */
    private final IBinder f395927v = new C146587e(this);

    /* renamed from: w */
    private final ClientConfig f395928w;

    public HotwordService() {
        C88486g gVar = new C88486g();
        gVar.f239199a = 4398047068161L;
        gVar.f239201c = amo.HOTWORD_SERVICE;
        gVar.f239204f = "search";
        this.f395928w = new ClientConfig(gVar);
        this.f395907b = new HashSet();
        this.f395909d = false;
        C91083b.m148803a(C91084c.SEARCH);
    }

    /* renamed from: b */
    public static Intent m238802b(String str) {
        return new Intent("com.google.android.googlequicksearchbox.HOTWORD_SERVICE").setPackage(str);
    }

    /* renamed from: d */
    public final void mo123378d(int i) {
        C89994f fVar = (C89994f) this.f395911f.mo27525b();
        String nameForUid = getPackageManager().getNameForUid(Binder.getCallingUid());
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        if (nameForUid == null) {
            nameForUid = "UNKNOWN";
        }
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164199c |= 2048;
        ufVar2.f164127ah = nameForUid;
        int R = fVar.mo83855R();
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164146b |= LinearLayoutManager.INVALID_OFFSET;
        ufVar3.f164091Y = R;
        String Z = fVar.mo83863Z();
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        Z.getClass();
        ufVar4.f164199c |= 1;
        ufVar4.f164092Z = Z;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: e */
    public final boolean mo123379e() {
        PackageManager packageManager = this.f395925t.getPackageManager();
        return packageManager.hasSystemFeature("com.google.android.feature.ECHO_REFERENCE") || packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_SPEECH_ENHANCEMENT");
    }

    public final IBinder onBind(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f395927v;
    }

    public final void onCreate() {
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate();
        C146585c cVar = new C146585c(this);
        C87673aa a = this.f395916k.mo81958a(cVar, cVar, this.f395928w);
        this.f395908c = a;
        a.mo81932c();
    }

    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = this.f395908c;
        if (aaVar2 != null) {
            aaVar2.mo81933e();
        }
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }
}
