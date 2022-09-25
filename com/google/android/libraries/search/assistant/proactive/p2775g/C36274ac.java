package com.google.android.libraries.search.assistant.proactive.p2775g;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49066fe;
import com.google.assistant.p3803ag.p3809c.C49067ff;
import com.google.assistant.p3803ag.p3809c.C49069fh;
import com.google.assistant.p3803ag.p3809c.C49073fl;
import com.google.assistant.p3803ag.p3809c.C49077fp;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.ac */
/* compiled from: PG */
public final class C36274ac implements C36275ad {

    /* renamed from: a */
    private static final C59071e f94748a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.g.ac");

    /* renamed from: b */
    private final Context f94749b;

    /* renamed from: c */
    private final Uri f94750c;

    /* renamed from: d */
    private final Uri f94751d;

    /* renamed from: e */
    private final Uri f94752e;

    /* renamed from: f */
    private final C42880af f94753f;

    /* renamed from: g */
    private final Executor f94754g;

    /* renamed from: h */
    private final Executor f94755h;

    /* renamed from: i */
    private final C21370a f94756i;

    public C36274ac(Context context, C42880af afVar, Executor executor, Executor executor2, C21370a aVar) {
        this.f94749b = context;
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a.f111968c = "opa";
        a.mo45821b("NotificationState.pb");
        this.f94750c = a.mo45820a();
        C42718e a2 = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a2.f111968c = "opa";
        a2.mo45821b("NotificationCategoryDefinitions.pb");
        this.f94751d = a2.mo45820a();
        C42718e a3 = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a3.f111968c = "opa";
        a3.mo45821b("NotificationsClientConfig.pb");
        this.f94752e = a3.mo45820a();
        this.f94753f = afVar;
        this.f94754g = executor;
        this.f94755h = executor2;
        this.f94756i = aVar;
    }

    /* renamed from: k */
    private final C42876ab m64735k() {
        C42880af afVar = this.f94753f;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f94751d);
        i.mo45967d(C49067ff.f126917e);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: l */
    private final C42876ab m64736l() {
        C42880af afVar = this.f94753f;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f94752e);
        i.mo45967d(C49078fq.f126937f);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: m */
    private final C42876ab m64737m() {
        C42880af afVar = this.f94753f;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f94750c);
        i.mo45967d(C49073fl.f126929c);
        return afVar.mo45979a(i.mo45964a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C49067ff mo40076a() {
        try {
            InputStream openRawResource = this.f94749b.getResources().openRawResource(R.raw.notification_category_zerostate_defaults_pb);
            try {
                C49069fh fhVar = (C49069fh) C62942bv.parseFrom((C62942bv) C49069fh.f126924b, openRawResource, C62921ba.m95368a());
                String languageTag = Locale.getDefault().toLanguageTag();
                String language = Locale.getDefault().getLanguage();
                C49067ff ffVar = null;
                for (C49067ff ffVar2 : fhVar.f126926a) {
                    if (ffVar2.f126921c.equals(languageTag)) {
                        return ffVar2;
                    }
                    if (true == ffVar2.f126921c.equals(language)) {
                        ffVar = ffVar2;
                    }
                }
                if (ffVar != null) {
                    return ffVar;
                }
                return C49067ff.f126917e;
            } catch (IOException e) {
                C59104x d = f94748a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotificationClientStore");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52285)).mo56386p("Notification category zerostate defaults can not be parsed!");
                return C49067ff.f126917e;
            }
        } catch (Resources.NotFoundException e2) {
            C59104x d2 = f94748a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotificationClientStore");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(52286)).mo56386p("Notification category zerostate defaults not found!");
            return C49067ff.f126917e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C49078fq mo40077b() {
        try {
            try {
                C49077fp fpVar = (C49077fp) ((C49078fq) C62942bv.parseFrom((C62942bv) C49078fq.f126937f, this.f94749b.getResources().openRawResource(R.raw.notification_client_config_defaults_pb), C62921ba.m95368a())).toBuilder();
                long b = this.f94756i.mo26870b();
                fpVar.copyOnWrite();
                C49078fq fqVar = (C49078fq) fpVar.instance;
                fqVar.f126939a |= 2;
                fqVar.f126943e = b;
                return (C49078fq) fpVar.build();
            } catch (IOException e) {
                C59104x d = f94748a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotificationClientStore");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52287)).mo56386p("Notifications client config defaults can not be parsed!");
                return C49078fq.f126937f;
            }
        } catch (Resources.NotFoundException e2) {
            C59104x d2 = f94748a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotificationClientStore");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(52288)).mo56386p("Notification client config defaults not found!");
            return C49078fq.f126937f;
        }
    }

    /* renamed from: c */
    public final C60870cx mo40078c() {
        return m64737m().mo46042d();
    }

    /* renamed from: d */
    public final C60870cx mo40079d(int i) {
        C60870cx d = m64737m().mo46042d();
        C36272aa aaVar = new C36272aa(i);
        return C60922j.m93044g(d, C47810es.m84963c(aaVar), this.f94754g);
    }

    /* renamed from: e */
    public final C60870cx mo40080e() {
        C60870cx d = m64736l().mo46042d();
        C36303x xVar = new C36303x(this);
        return C60922j.m93044g(d, C47810es.m84963c(xVar), this.f94754g);
    }

    /* renamed from: f */
    public final C60870cx mo40081f() {
        C60870cx d = m64735k().mo46042d();
        C36273ab abVar = new C36273ab(this);
        return C60922j.m93044g(d, C47810es.m84963c(abVar), this.f94755h);
    }

    /* renamed from: g */
    public final C60870cx mo40082g(C49067ff ffVar, List list) {
        C49066fe feVar = (C49066fe) ffVar.toBuilder();
        for (int max = Math.max(0, list.size() - 4); max < list.size(); max++) {
            int intValue = ((Integer) list.get(max)).intValue();
            feVar.copyOnWrite();
            C49067ff ffVar2 = (C49067ff) feVar.instance;
            C62961ch chVar = ffVar2.f126922d;
            if (!chVar.mo58948c()) {
                ffVar2.f126922d = C62942bv.mutableCopy(chVar);
            }
            ffVar2.f126922d.mo58916g(intValue);
        }
        return m64735k().mo46039a(new C36301v(feVar), this.f94754g);
    }

    /* renamed from: h */
    public final C60870cx mo40083h(C49078fq fqVar) {
        return m64736l().mo46039a(new C36304y(fqVar), this.f94754g);
    }

    /* renamed from: i */
    public final void mo40084i(int i, boolean z) {
        m64737m().mo46039a(new C36305z(i, z), this.f94754g);
    }

    /* renamed from: j */
    public final void mo40085j(int i, boolean z) {
        m64737m().mo46039a(new C36302w(i, z), this.f94754g);
    }
}
