package com.google.android.apps.gsa.staticplugins.opa.samson.p8415a;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.opa.C83579aj;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87760co;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88256uy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88259va;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.C109711mp;
import com.google.android.apps.gsa.staticplugins.opa.C109712mq;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.p8279an.C107126a;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8400n.C109725c;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.TypeInText;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110014a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110015b;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.a.d */
/* compiled from: PG */
public final class C110018d implements C87682aj, C110014a {

    /* renamed from: i */
    private static final C59071e f306497i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.a.d");

    /* renamed from: j */
    private static final Interpolator f306498j = C91107f.m148859b(0.16f, 0.0f, 0.0f, 1.0f);

    /* renamed from: a */
    public final Activity f306499a;

    /* renamed from: b */
    StreamingTextView f306500b;

    /* renamed from: c */
    TypeInText f306501c;

    /* renamed from: d */
    View f306502d;

    /* renamed from: e */
    View f306503e;

    /* renamed from: f */
    FrameLayout f306504f;

    /* renamed from: g */
    public boolean f306505g;

    /* renamed from: h */
    boolean f306506h;

    /* renamed from: k */
    private final C83579aj f306507k;

    /* renamed from: l */
    private final C107710u f306508l;

    /* renamed from: m */
    private final C86124t f306509m;

    /* renamed from: n */
    private View f306510n;

    /* renamed from: o */
    private View f306511o;

    /* renamed from: p */
    private boolean f306512p = true;

    /* renamed from: q */
    private boolean f306513q;

    /* renamed from: r */
    private int f306514r;

    /* renamed from: s */
    private int f306515s;

    /* renamed from: t */
    private final C110015b f306516t;

    /* renamed from: u */
    private int f306517u = 0;

    /* renamed from: v */
    private final C107126a f306518v;

    public C110018d(C109712mq mqVar, C107619d dVar, C107710u uVar, C58833ax axVar, Activity activity, C110015b bVar, C86124t tVar) {
        C83579aj a = mqVar.mo98043a(new C110017c());
        this.f306507k = a;
        a.mo76918f(dVar);
        this.f306508l = uVar;
        this.f306518v = (C107126a) axVar.mo56107c();
        this.f306499a = activity;
        this.f306516t = bVar;
        this.f306509m = tVar;
    }

    /* renamed from: b */
    public static void m183242b(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: h */
    private final void m183243h(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f306505g = z;
        this.f306516t.mo98296a(z);
    }

    /* renamed from: a */
    public final void mo98291a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f306505g && !this.f306506h) {
            C107126a aVar = this.f306518v;
            FrameLayout frameLayout = aVar.f298204b;
            FrameLayout frameLayout2 = aVar.f298203a;
            if (!(frameLayout == null || frameLayout2 == null)) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(4);
                frameLayout2.setVisibility(0);
            }
            if (this.f306513q) {
                this.f306499a.getWindow().getDecorView().setSystemUiVisibility(this.f306514r);
            }
            if (this.f306513q) {
                this.f306499a.getWindow().setFlags(this.f306515s, -1);
            }
            this.f306513q = false;
            m183243h(false);
            this.f306508l.mo96221d(this, new C88244um[0]);
            this.f306517u = 0;
        }
    }

    /* renamed from: d */
    public final void mo98292d() {
        C107126a aVar = this.f306518v;
        View view = this.f306510n;
        if (view == null) {
            view = LayoutInflater.from(this.f306499a).inflate(R.layout.aod_mic_ui, new FrameLayout(this.f306499a), false);
            view.setOnTouchListener(new C110011a(this));
            this.f306500b = (StreamingTextView) view.findViewById(R.id.aod_transcription_streaming_text);
            this.f306511o = view.findViewById(R.id.aod_greeting_text);
            this.f306501c = (TypeInText) view.findViewById(R.id.aod_greeting_type_in_text);
            this.f306502d = view.findViewById(R.id.aod_opa_logo);
            this.f306503e = view.findViewById(R.id.aod_opa_logo_animation);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.aod_logo_view_container);
            this.f306504f = frameLayout;
            this.f306507k.mo76914a(frameLayout, R.id.aod_logo_view_container);
            TypedValue typedValue = new TypedValue();
            FrameLayout frameLayout2 = this.f306504f;
            View childAt = frameLayout2 != null ? frameLayout2.getChildAt(0) : null;
            if (childAt != null) {
                this.f306499a.getResources().getValue(R.dimen.aod_voice_logo_multiplier, typedValue, true);
                float f = typedValue.getFloat();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = (int) (((float) layoutParams.width) * f);
                layoutParams.height = (int) (((float) layoutParams.height) * f);
            }
            this.f306510n = view;
        }
        FrameLayout frameLayout3 = aVar.f298204b;
        FrameLayout frameLayout4 = aVar.f298203a;
        if (!(frameLayout3 == null || frameLayout4 == null || frameLayout3.getChildCount() > 0)) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout3.addView(view);
            frameLayout3.setVisibility(0);
            frameLayout4.setVisibility(4);
        }
        if (this.f306509m.mo79746e(C90014bt.f247131bP)) {
            m183242b(this.f306503e, 0);
            m183242b(this.f306502d, 8);
            m183242b(this.f306511o, 8);
            m183242b(this.f306504f, 8);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f306503e, View.TRANSLATION_Y, new float[]{(float) (-this.f306499a.getResources().getDimensionPixelSize(R.dimen.aod_logo_animation_translation_y))}).setDuration(550);
            duration.setInterpolator(f306498j);
            duration.addListener(new C110013b(this));
            duration.start();
        }
        this.f306514r = this.f306499a.getWindow().getDecorView().getSystemUiVisibility();
        this.f306499a.getWindow().getDecorView().setSystemUiVisibility(5638);
        this.f306515s = this.f306499a.getWindow().getAttributes().flags;
        this.f306499a.getWindow().addFlags(1024);
        this.f306513q = true;
        m183243h(true);
        this.f306508l.mo96220c(this, C88244um.UPDATE_RECOGNIZED_TEXT, C88244um.SET_FINAL_RECOGNIZED_TEXT, C88244um.SHOW_RECOGNITION_STATE, C88244um.SET_EXTERNAL_FLAGS, C88244um.CONVERSATION_SURFACE_EVENT, C88244um.NOTIFY_COMPLETED_ASSISTANT_CONVERSATION);
    }

    /* renamed from: e */
    public final boolean mo98293e() {
        return this.f306505g;
    }

    /* renamed from: f */
    public final boolean mo98294f() {
        return this.f306506h;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        View view;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 51) {
            C88259va vaVar = (C88259va) serviceEventData.mo81918e(C88256uy.f238719a);
            int i = vaVar.f238724b;
            String str = vaVar.f238725c;
            String str2 = vaVar.f238726d;
            this.f306507k.mo76919g(i & -8193);
        } else if (ordinal == 72) {
            C62940bt btVar = C87760co.f237522a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C59104x d = f306497i.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DOUICI");
                ((C59052c) ((C59052c) d).mo56372aa(25596)).mo56386p("handleConversationSurfaceEvent: missing ConversationSurfaceEvent extension");
                return;
            }
            C87768cw cwVar = (C87768cw) serviceEventData.mo81918e(C87760co.f237522a);
            int a2 = C87765ct.m142765a(cwVar.f237532e);
            if (a2 != 0 && a2 == 4) {
                try {
                    C58833ax c = C109725c.m182679c((C51809dy) C62942bv.parseFrom((C62942bv) C51809dy.f135933f, cwVar.f237529b));
                    if (c.mo56113h() && "stay_in_immersive".equals(c.mo56107c())) {
                        C58976aa aaVar = C58975e.f156826a;
                        this.f306506h = true;
                    }
                } catch (C62974ct e) {
                    C59104x c2 = f306497i.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "DOUICI");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(25595)).mo56386p("Failed to parse client op");
                }
            }
        } else if (ordinal != 113) {
            switch (ordinal) {
                case 44:
                    String str3 = ((C88262vd) serviceEventData.mo81918e(C88260vb.f238727a)).f238731b;
                    StreamingTextView streamingTextView = this.f306500b;
                    if (streamingTextView != null) {
                        streamingTextView.mo82924c(str3);
                        return;
                    }
                    return;
                case 45:
                    C88382zp zpVar = (C88382zp) serviceEventData.mo81918e(C88380zn.f238990a);
                    String str4 = zpVar.f238994b;
                    String str5 = zpVar.f238995c;
                    StreamingTextView streamingTextView2 = this.f306500b;
                    if (this.f306509m.mo79746e(C90014bt.f247131bP)) {
                        view = this.f306501c;
                    } else {
                        view = this.f306511o;
                    }
                    if (streamingTextView2 != null && view != null) {
                        if (this.f306512p) {
                            view.setVisibility(8);
                            this.f306512p = false;
                        }
                        streamingTextView2.mo82923b(str4, str5);
                        return;
                    }
                    return;
                case 46:
                    int i2 = ((C88304ws) serviceEventData.mo81918e(C88302wq.f238816a)).f238820b;
                    int i3 = this.f306517u;
                    if (i2 == 5) {
                        if ((i3 == 2 || i3 == 3 || i3 == 4 || i3 == 10) && !((C109711mp) this.f306507k).f305657g && this.f306505g) {
                            this.f306499a.finish();
                        }
                        i2 = 5;
                    }
                    this.f306507k.mo76915b(i2);
                    this.f306517u = i2;
                    return;
                default:
                    return;
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f306506h = false;
        }
    }

    /* renamed from: g */
    public final void mo98295g(C88523c cVar) {
        ((C109711mp) this.f306507k).f305661k = cVar;
    }
}
