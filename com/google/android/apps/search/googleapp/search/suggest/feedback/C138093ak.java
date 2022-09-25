package com.google.android.apps.search.googleapp.search.suggest.feedback;

import android.content.Context;
import android.support.p033v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RadioButton;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47582cf;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58827ar;
import com.google.common.base.C58896f;
import com.google.common.base.C58898h;
import com.google.common.base.C58911u;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.ak */
/* compiled from: PG */
public final class C138093ak {

    /* renamed from: a */
    public static final C58974d f375709a = C58974d.m91134h("SuggestFeedbackFragment");

    /* renamed from: b */
    static final C58827ar f375710b = C58827ar.m90818c(' ');

    /* renamed from: k */
    private static final Map f375711k;

    /* renamed from: c */
    public final C138030av f375712c;

    /* renamed from: d */
    public final C138098ao f375713d;

    /* renamed from: e */
    public final Context f375714e;

    /* renamed from: f */
    public final C138109k f375715f;

    /* renamed from: g */
    public final C46439e f375716g;

    /* renamed from: h */
    public final C47770dh f375717h;

    /* renamed from: i */
    public int f375718i = 0;

    /* renamed from: j */
    public final C46440f f375719j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            ((C58970a) ((C58970a) ((C58970a) C138093ak.f375709a.mo56226d()).mo56382g(th)).mo56372aa(41089)).mo56386p("Failed to submit feedback.");
            C138093ak.this.mo114142g();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            Void voidR = (Void) obj2;
            C138093ak.this.mo114142g();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: l */
    private final C138120v f375720l;

    /* renamed from: m */
    private final C133148g f375721m;

    static {
        HashMap hashMap = new HashMap();
        f375711k = hashMap;
        hashMap.put(1, Integer.valueOf(R.id.googleapp_option1));
        hashMap.put(2, Integer.valueOf(R.id.googleapp_option2));
        hashMap.put(3, Integer.valueOf(R.id.googleapp_option3));
        hashMap.put(4, Integer.valueOf(R.id.googleapp_option4));
        hashMap.put(5, Integer.valueOf(R.id.googleapp_option5));
        hashMap.put(6, Integer.valueOf(R.id.googleapp_option6));
        hashMap.put(7, Integer.valueOf(R.id.googleapp_option_other));
    }

    public C138093ak(Context context, C138120v vVar, C138098ao aoVar, C138109k kVar, C46439e eVar, C47770dh dhVar, IncognitoLifecycleObserver incognitoLifecycleObserver, C133148g gVar) {
        this.f375714e = context;
        this.f375720l = vVar;
        this.f375713d = aoVar;
        C138030av avVar = aoVar.f375730d;
        this.f375712c = avVar == null ? C138030av.f375536m : avVar;
        this.f375715f = kVar;
        this.f375716g = eVar;
        this.f375717h = dhVar;
        this.f375721m = gVar;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: c */
    public static String m224425c(String str) {
        return new C58896f(C58911u.f156751b, C58898h.f156736a).mo56194o(str);
    }

    /* renamed from: i */
    private final View m224426i() {
        View view = this.f375720l.getView();
        view.getClass();
        return view;
    }

    /* renamed from: j */
    private final RadioButton m224427j(int i) {
        View i2 = m224426i();
        Integer num = (Integer) f375711k.get(Integer.valueOf(i));
        num.getClass();
        return (RadioButton) i2.findViewById(num.intValue());
    }

    /* renamed from: a */
    public final EditText mo114137a() {
        return (EditText) m224426i().findViewById(R.id.googleapp_additional_comment_box);
    }

    /* renamed from: b */
    public final EditText mo114138b() {
        return (EditText) m224426i().findViewById(R.id.googleapp_other_option_edit);
    }

    /* renamed from: d */
    public final void mo114139d() {
        C47393f.m84237h(C138110l.f375772a, m224426i());
    }

    /* renamed from: e */
    public final void mo114140e(View view) {
        ((InputMethodManager) this.f375714e.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: f */
    public final void mo114141f(int i) {
        m224427j(i).setChecked(true);
        EditText b = mo114138b();
        int i2 = this.f375718i;
        if (!(i2 == 0 || i2 == i)) {
            m224427j(i2).setChecked(false);
            if (this.f375718i == 7) {
                b.setVisibility(4);
                mo114140e(b);
            }
        }
        if (i == 7) {
            b.setVisibility(0);
        }
        EditText a = mo114137a();
        if (a.hasFocus()) {
            a.clearFocus();
            mo114140e(a);
        }
        this.f375718i = i;
    }

    /* renamed from: g */
    public final void mo114142g() {
        C44581b a = this.f375721m.mo110993a(this.f375714e, Optional.empty());
        a.mo47604w(R.string.ga_thank_you_dialog_title);
        a.mo47597p(R.string.ga_thank_you_dialog_message);
        a.mo47601t(R.string.ga_suggest_feedback_done, new C47752cq(this.f375717h, "Feedback positive dialog button clicked", new C138124z(this)));
        a.f1347a.f1334o = new C47582cf(this.f375717h, new C138083aa(this));
        a.create().show();
    }

    /* renamed from: h */
    public final void mo114143h() {
        MenuItem findItem = ((Toolbar) m224426i().findViewById(R.id.googleapp_suggest_feedback_toolbar)).mo2393g().findItem(R.id.googleapp_menu_send);
        int i = this.f375718i;
        boolean z = false;
        if (i != 0 && (i != 7 || !TextUtils.isEmpty(m224425c(mo114138b().getText().toString())))) {
            z = true;
        }
        if (z) {
            findItem.setTitle(R.string.ga_menu_send_button_content_description);
        } else if (this.f375718i == 7) {
            findItem.setTitle(R.string.ga_other_reason_not_fill_in_content_description);
        }
        findItem.setEnabled(z);
    }
}
