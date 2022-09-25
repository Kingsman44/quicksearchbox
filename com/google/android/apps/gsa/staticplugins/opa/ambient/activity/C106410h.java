package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opa.smartspace.C83744c;
import com.google.android.apps.gsa.opa.smartspace.C83801q;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106745c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f.C106769f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f.C106770g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8267c.C107045a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8267c.C107046b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8274i.p8275a.C107080b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8274i.p8275a.C107081c;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110093d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.h */
/* compiled from: PG */
public final class C106410h extends C106400aa {

    /* renamed from: a */
    public static final C59071e f296816a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.activity.h");

    /* renamed from: b */
    public Activity f296817b;

    /* renamed from: c */
    public C110093d f296818c;

    /* renamed from: d */
    public C92125t f296819d;

    /* renamed from: e */
    public C84516aa f296820e;

    /* renamed from: f */
    public C60888db f296821f;

    /* renamed from: g */
    public Map f296822g;

    /* renamed from: h */
    public C90021c f296823h;

    /* renamed from: i */
    public C106770g f296824i;

    /* renamed from: j */
    public C69464a f296825j;

    /* renamed from: k */
    public C92122r f296826k;

    /* renamed from: l */
    public Intent f296827l;

    /* renamed from: m */
    C107081c f296828m;

    /* renamed from: n */
    public View f296829n;

    /* renamed from: o */
    public ViewGroup f296830o;

    /* renamed from: p */
    public C0816c f296831p;

    /* renamed from: q */
    private String f296832q;

    /* renamed from: r */
    private List f296833r;

    /* renamed from: s */
    private TextView f296834s;

    /* renamed from: t */
    private ImageButton f296835t;

    /* renamed from: u */
    private View f296836u;

    /* renamed from: v */
    private LinearLayout f296837v;

    /* renamed from: d */
    private final void m177212d(C50701am amVar, Optional optional, ViewGroup viewGroup) {
        C106745c cVar;
        C60870cx cxVar;
        if (this.f296822g.containsKey(Integer.valueOf(amVar.f131953N))) {
            cVar = (C106745c) this.f296822g.get(Integer.valueOf(amVar.f131953N));
        } else {
            cVar = (C106745c) this.f296822g.get(0);
        }
        if (cVar == null) {
            C59104x d = f296816a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AADetailsFragment");
            ((C59052c) ((C59052c) d).mo56372aa(23049)).mo56387q("detailsRendererProvider is null!? %d", amVar.f131953N);
            return;
        }
        WeakReference weakReference = new WeakReference(this);
        ViewGroup viewGroup2 = this.f296830o;
        C60888db dbVar = this.f296821f;
        C106770g gVar = this.f296824i;
        C92125t tVar = this.f296819d;
        if (optional.isPresent()) {
            cxVar = C60856cj.m92900i(optional);
        } else {
            C60870cx a = gVar.mo95646a();
            C106769f fVar = new C106769f(amVar);
            cxVar = C60922j.m93044g(a, C47810es.m84963c(fVar), gVar.f297543a);
        }
        C60856cj.m92911t(C60922j.m93045h(C60922j.m93045h(cxVar, C47810es.m84966f(new C106413k(cVar, viewGroup)), dbVar), C47810es.m84966f(new C106414l(weakReference, dbVar)), dbVar), C47810es.m84974n(new C106415m(weakReference, viewGroup, tVar, viewGroup2)), dbVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58485gu guVar;
        List list;
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.aa_details_fragment, viewGroup, false);
        this.f296830o = viewGroup2;
        C28295m.m52919e(viewGroup2, new C28292j(104338));
        this.f296834s = (TextView) this.f296830o.findViewById(R.id.context_title);
        this.f296836u = this.f296830o.findViewById(R.id.lock_icon);
        this.f296835t = (ImageButton) this.f296830o.findViewById(R.id.feedback_button);
        this.f296829n = this.f296830o.findViewById(R.id.settings_icon);
        this.f296831p = registerForActivityResult(new C0813f(), C106408f.f296814a);
        LinearLayout linearLayout = (LinearLayout) this.f296830o.findViewById(R.id.aa_linear_layout);
        this.f296837v = linearLayout;
        C28295m.m52919e(linearLayout, new C28292j(104339));
        FrameLayout frameLayout = (FrameLayout) this.f296830o.findViewById(R.id.opa_amb_logo_container);
        ImageView a = this.f296818c.mo98370a(e.aq, R.layout.aa_opa_logo_view, 83114);
        if (a.getParent() instanceof ViewGroup) {
            ((ViewGroup) a.getParent()).removeView(a);
        }
        frameLayout.addView(a);
        if (this.f296823h.mo79746e(C90017bw.f247974bj)) {
            C106409g gVar = new C106409g(this);
            this.f296830o.setOnClickListener(gVar);
            this.f296837v.setOnClickListener(gVar);
        }
        Intent intent = this.f296827l;
        C58976aa aaVar = C58975e.f156826a;
        if (!intent.hasExtra("EXTRA_GUARD_FLAG") || !"fKgFlIyrPSgS7zcayDoI".equals(intent.getStringExtra("EXTRA_GUARD_FLAG"))) {
            C59104x c = C107046b.f298087a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "amaPIntentUtils");
            ((C59052c) ((C59052c) c).mo56372aa(23459)).mo56386p("Please use #getPendingIntentActivity/Broadcast() from this util class instead.");
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("EXTRA_SMARTSPACECHIPCONTENT_CHIPS")) {
            guVar = C58485gu.m89845m();
        } else {
            try {
                list = ProtoParsers.m95528k(extras, "EXTRA_SMARTSPACECHIPCONTENT_CHIPS", C50738bc.f132032l, C62921ba.m95368a());
            } catch (C62974ct e) {
                C59104x c2 = C107045a.f298086a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "IntentUtils");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(23458)).mo56386p("Unable to get protos");
                list = null;
            }
            if (list == null || list.isEmpty()) {
                guVar = C58485gu.m89845m();
            } else {
                ArrayList parcelableArrayList = extras.getParcelableArrayList("EXTRA_SMARTSPACECHIPCONTENT_BITMAPS");
                if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                    guVar = C58485gu.m89845m();
                } else {
                    ArrayList parcelableArrayList2 = extras.getParcelableArrayList("EXTRA_SMARTSPACECHIPCONTENT_PENDING_INTENTS");
                    if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty()) {
                        guVar = C58485gu.m89845m();
                    } else {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            C83801q e2 = C83802r.m133487e();
                            C83744c cVar = (C83744c) e2;
                            cVar.f228273c = C58833ax.m90834k((C50738bc) list.get(i2));
                            cVar.f228271a = C58833ax.m90833j((PendingIntent) parcelableArrayList2.get(i2));
                            cVar.f228272b = (Bitmap) parcelableArrayList.get(i2);
                            arrayList.add(e2.mo77069a());
                        }
                        guVar = C58485gu.m89842j(arrayList);
                    }
                }
            }
        }
        this.f296833r = guVar;
        String string = extras != null ? extras.getString("EXTRA_TITLE") : BuildConfig.FLAVOR;
        this.f296832q = string;
        if (TextUtils.isEmpty(string) && ((C107080b) this.f296828m).f298135b.isPresent()) {
            this.f296832q = (String) ((C107080b) this.f296828m).f298135b.get();
        }
        if (this.f296823h.mo79746e(C90017bw.f247860B)) {
            this.f296835t.setOnClickListener(new C106407e(this));
        }
        this.f296830o.post(new C106405c(this));
        this.f296829n.setOnClickListener(new C106406d(this));
        for (C83802r d : this.f296833r) {
            FrameLayout frameLayout2 = new FrameLayout(this.f296817b);
            C50701am a2 = C50701am.m85887a(((C50738bc) d.mo77094d().mo56107c()).f132040g);
            if (a2 == null) {
                a2 = C50701am.UNKNOWN;
            }
            m177212d(a2, Optional.empty(), frameLayout2);
            this.f296837v.addView(frameLayout2);
        }
        if (this.f296828m.mo95784f() != C50701am.UNKNOWN) {
            m177212d(this.f296828m.mo95784f(), ((C107080b) this.f296828m).f298136c, this.f296837v);
        }
        View view = this.f296836u;
        if (true != this.f296820e.f230023b.isDeviceLocked()) {
            i = 8;
        }
        view.setVisibility(i);
        String str = this.f296832q;
        if (str != null) {
            this.f296834s.setText(str);
        } else if (((C107080b) this.f296828m).f298135b.isPresent()) {
            this.f296834s.setText((CharSequence) ((C107080b) this.f296828m).f298135b.get());
        }
        return this.f296830o;
    }
}
