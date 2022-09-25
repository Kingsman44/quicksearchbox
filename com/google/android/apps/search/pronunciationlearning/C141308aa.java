package com.google.android.apps.search.pronunciationlearning;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.C0154a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.apps.search.pronunciationlearning.p10628a.C141305l;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10632b.C141349a;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10632b.C141357i;
import com.google.android.apps.search.pronunciationlearning.p10635d.C141399r;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141401a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.MicView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10642b.C141462b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.C141503g;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.ProntoFeedbackView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58837ba;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqa;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54534d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.pronunciationlearning.aa */
/* compiled from: PG */
public final class C141308aa {

    /* renamed from: a */
    public static final C59071e f383626a = C59071e.m91332i("com.google.android.apps.search.pronunciationlearning.aa");

    /* renamed from: b */
    public static final C58872ci f383627b = new C58872ci(C58274c.f155808a);

    /* renamed from: A */
    public int f383628A = 3;

    /* renamed from: c */
    public final C46801dp f383629c;

    /* renamed from: d */
    public final C141349a f383630d;

    /* renamed from: e */
    public final C141524z f383631e;

    /* renamed from: f */
    public final AccountId f383632f;

    /* renamed from: g */
    public final C46439e f383633g;

    /* renamed from: h */
    public final C141399r f383634h;

    /* renamed from: i */
    public final C141305l f383635i;

    /* renamed from: j */
    public final C141312d f383636j;

    /* renamed from: k */
    public final C141309a f383637k;

    /* renamed from: l */
    public final C141315g f383638l;

    /* renamed from: m */
    public final C141314f f383639m;

    /* renamed from: n */
    public final C141311c f383640n;

    /* renamed from: o */
    public final C141330c f383641o;

    /* renamed from: p */
    public final C141512e f383642p;

    /* renamed from: q */
    public final C141413h f383643q;

    /* renamed from: r */
    public final C141462b f383644r;

    /* renamed from: s */
    public final C141401a f383645s;

    /* renamed from: t */
    public final boolean f383646t;

    /* renamed from: u */
    public final C46128f f383647u;

    /* renamed from: v */
    public final C141313e f383648v;

    /* renamed from: w */
    public boolean f383649w;

    /* renamed from: x */
    public boolean f383650x;

    /* renamed from: y */
    public boolean f383651y;

    /* renamed from: z */
    public int f383652z = 1;

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$a */
    /* compiled from: PG */
    final class C141309a implements C46440f {
        public C141309a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C141308aa.this.mo116338c();
            View view = C141308aa.this.f383631e.getView();
            view.getClass();
            view.findViewById(R.id.pronunciationlearning_practice_input_view).setVisibility(8);
            View view2 = C141308aa.this.f383631e.getView();
            view2.getClass();
            view2.findViewById(R.id.pronunciationlearning_feedback_view).setVisibility(0);
            View view3 = C141308aa.this.f383631e.getView();
            view3.getClass();
            ((ProntoFeedbackView) view3.findViewById(R.id.pronunciationlearning_feedback_view)).mo17754z().mo116525b();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C141308aa.this.mo116338c();
            if (C141308aa.this.mo116336a() != null) {
                C141308aa.this.f383635i.mo116335d();
                C141308aa.this.mo116342g();
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$b */
    /* compiled from: PG */
    final class C141310b implements C46792di {
        public C141310b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C141308aa.f383626a.mo56226d()).mo56382g(th)).mo56372aa(41666)).mo56386p("Fetch pronto RecognitionUpdate failed.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141357i iVar = (C141357i) obj;
            MicView a = C141308aa.this.mo116336a();
            if (a != null) {
                int i = iVar.f383750a;
                if (i == 1) {
                    a.mo17754z().f383983b = iVar.f383750a == 1 ? ((Integer) iVar.f383751b).intValue() : 0;
                } else if (i == 2) {
                    C58872ci ciVar = C141308aa.f383627b;
                    if (ciVar.f156708a) {
                        ciVar.mo56160e();
                    }
                    C141308aa.f383627b.mo56161f();
                    a.mo17754z().mo116461b();
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$c */
    /* compiled from: PG */
    final class C141311c implements C46440f {
        public C141311c() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C141308aa.f383626a.mo56224b()).mo56382g(th)).mo56372aa(41667)).mo56386p("QueryRecordingCallback onFailure");
            long a = C141308aa.f383627b.mo56158a(TimeUnit.MILLISECONDS);
            C141308aa.f383627b.mo56160e();
            View view = C141308aa.this.f383631e.getView();
            view.getClass();
            ((ProntoFeedbackView) view.findViewById(R.id.pronunciationlearning_feedback_view)).mo17754z().mo116525b();
            C141308aa.this.mo116337b(C62722b.INTERNAL, a, 0);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str;
            Void voidR = (Void) obj;
            C59071e eVar = C141308aa.f383626a;
            long a = C141308aa.f383627b.mo56158a(TimeUnit.MILLISECONDS);
            C141308aa.f383627b.mo56160e();
            View view = C141308aa.this.f383631e.getView();
            view.getClass();
            C141503g a2 = ((ProntoFeedbackView) view.findViewById(R.id.pronunciationlearning_feedback_view)).mo17754z();
            View view2 = C141308aa.this.f383631e.getView();
            view2.getClass();
            String obj3 = ((TextView) view2.findViewById(R.id.pronunciationlearning_expected_text)).getText().toString();
            int i = C141308aa.this.f383628A;
            LinearLayout linearLayout = (LinearLayout) a2.f384105a.findViewById(R.id.pronunciationlearning_per_word_feedback);
            int a3 = a2.f384107c.mo116523a((C54534d) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C54534d.f143186b, C62921ba.m95368a()), obj3, (TextView) a2.f384105a.findViewById(R.id.pronunciationlearning_feedback_text), (PhonemeView) a2.f384105a.findViewById(R.id.pronunciationlearning_expected_pron), (PhonemeView) a2.f384105a.findViewById(R.id.pronunciationlearning_actual_pron));
            TextView textView = (TextView) a2.f384105a.findViewById(R.id.pronunciationlearning_extra_message_feedback_text);
            if (a3 > 0) {
                linearLayout.setVisibility(0);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                if (i >= 3 || a3 <= 1 || C58837ba.m90859h(a2.f384106b.mo116541c())) {
                    str = a2.f384106b.mo116542d();
                } else {
                    str = a2.f384106b.mo116542d() + " " + a2.f384106b.mo116541c();
                }
                textView.setText(str);
                textView.setTextColor(a2.mo116524a(R.color.agsa_color_on_background));
            } else if (a3 == 0) {
                String str2 = (String) a2.f384106b.f384126d.get("GoodJobText");
                str2.getClass();
                textView.setText(str2);
                textView.setCompoundDrawablesWithIntrinsicBounds(C1877c.m5125a(a2.f384105a.getContext(), R.drawable.pronunciationlearning_good_job_icon), (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setTextColor(a2.mo116524a(R.color.pronunciationlearning_text_green));
                linearLayout.setVisibility(8);
            } else {
                String str3 = (String) a2.f384106b.f384126d.get("EmptyFeedbackError");
                str3.getClass();
                textView.setText(str3);
                textView.setCompoundDrawablesWithIntrinsicBounds(C1877c.m5125a(a2.f384105a.getContext(), R.drawable.pronunciationlearning_error_message_icon), (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setTextColor(a2.mo116524a(R.color.agsa_color_error));
                linearLayout.setVisibility(8);
            }
            C141308aa.this.mo116337b(C62722b.OK, a, a3);
            if (a3 != -1) {
                C141308aa.this.f383652z++;
            }
            if (a3 == 0) {
                C141308aa aaVar = C141308aa.this;
                aaVar.f383633g.mo50428h(new C46438d(aaVar.f383647u.mo50214a(aaVar.f383632f)).f121541a, (Object) null, aaVar.f383644r.f383977c);
            }
            if (a3 > 1) {
                C141308aa aaVar2 = C141308aa.this;
                aaVar2.f383628A++;
                aaVar2.f383645s.mo116414b();
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$d */
    /* compiled from: PG */
    final class C141312d implements C46440f {
        public C141312d() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C141308aa.this.mo116338c();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C141308aa.this.mo116338c();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$e */
    /* compiled from: PG */
    final class C141313e implements C46440f {
        public C141313e() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59071e eVar = C141308aa.f383626a;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C141308aa.this.f383628A = ((Integer) obj2).intValue();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$f */
    /* compiled from: PG */
    final class C141314f implements C46440f {
        public C141314f() {
        }

        /* renamed from: d */
        private final void m229375d() {
            View view = C141308aa.this.f383631e.getView();
            view.getClass();
            PhonemeView phonemeView = (PhonemeView) view.findViewById(R.id.pronunciationlearning_actual_pron);
            if (phonemeView != null) {
                phonemeView.mo17754z().mo116517a(false);
            }
            C141308aa.this.f383651y = false;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            m229375d();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            m229375d();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.aa$g */
    /* compiled from: PG */
    final class C141315g implements C46440f {
        public C141315g() {
        }

        /* renamed from: d */
        private final void m229379d() {
            View view = C141308aa.this.f383631e.getView();
            view.getClass();
            PhonemeView phonemeView = (PhonemeView) view.findViewById(R.id.pronunciationlearning_expected_pron);
            if (phonemeView != null) {
                phonemeView.mo17754z().mo116517a(false);
            }
            C141308aa.this.f383650x = false;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            m229379d();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            m229379d();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C141308aa(C46801dp dpVar, C141349a aVar, C141524z zVar, AccountId accountId, C46439e eVar, C141399r rVar, C141305l lVar, C141330c cVar, C141512e eVar2, C141413h hVar, C141462b bVar, C46128f fVar, C141401a aVar2, boolean z) {
        this.f383629c = dpVar;
        this.f383630d = aVar;
        this.f383631e = zVar;
        this.f383632f = accountId;
        this.f383633g = eVar;
        this.f383634h = rVar;
        this.f383635i = lVar;
        this.f383641o = cVar;
        this.f383642p = eVar2;
        this.f383643q = hVar;
        this.f383647u = fVar;
        this.f383644r = bVar;
        this.f383645s = aVar2;
        this.f383646t = z;
        this.f383636j = new C141312d();
        this.f383637k = new C141309a();
        this.f383638l = new C141315g();
        this.f383639m = new C141314f();
        this.f383640n = new C141311c();
        this.f383648v = new C141313e();
        cVar.mo116368h();
    }

    /* renamed from: h */
    private final boolean m229352h() {
        MicView a = mo116336a();
        return a != null && a.mo17754z().f383982a;
    }

    /* renamed from: a */
    public final MicView mo116336a() {
        View view = this.f383631e.getView();
        if (view != null) {
            return (MicView) view.findViewById(R.id.pronunciationlearning_mic_container);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo116337b(C62722b bVar, long j, int i) {
        mo116341f(false);
        C141330c cVar = this.f383641o;
        int length = this.f383643q.f383855b.length();
        C141413h hVar = this.f383643q;
        int a = aqa.m92456a(hVar.f383856c);
        cVar.mo116372l(bVar, j, i, length, a == 0 ? 1 : a, this.f383652z, hVar.f383857d);
    }

    /* renamed from: c */
    public final void mo116338c() {
        View view = this.f383631e.getView();
        ImageView imageView = view != null ? (ImageView) view.findViewById(R.id.pronunciationlearning_sentence_tts_button) : null;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.quantum_ic_volume_up_vd_theme_24);
        }
        this.f383649w = false;
    }

    /* renamed from: d */
    public final void mo116339d(String str) {
        View view = this.f383631e.getView();
        view.getClass();
        this.f383641o.mo116369i(C62722b.OK);
        this.f383641o.f383688a++;
        C141415j a = C141415j.m229481a(this.f383632f, str);
        C0154a aVar = new C0154a(this.f383631e.getParentFragmentManager());
        aVar.mo689v(((ViewGroup) view.getParent()).getId(), a, "PronunciationContentFragment");
        aVar.mo509f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo116340e() {
        View view = this.f383631e.getView();
        view.getClass();
        view.findViewById(R.id.pronunciationlearning_practice_input_view).setVisibility(8);
        View view2 = this.f383631e.getView();
        view2.getClass();
        view2.findViewById(R.id.pronunciationlearning_feedback_view).setVisibility(8);
        this.f383649w = true;
        View view3 = this.f383631e.getView();
        view3.getClass();
        View view4 = this.f383631e.getView();
        view4.getClass();
        String b = this.f383642p.mo116540b();
        String valueOf = String.valueOf(((TextView) view4.findViewById(R.id.pronunciationlearning_expected_text)).getText());
        C60870cx a = this.f383634h.mo116408a(b + ", " + valueOf);
        C46439e eVar = this.f383633g;
        C46438d b2 = C46438d.m82810b(a);
        eVar.mo50428h(b2.f121541a, (Object) null, this.f383637k);
        ((ImageView) view3.findViewById(R.id.pronunciationlearning_sentence_tts_button)).setImageResource(R.drawable.quantum_ic_stop_vd_theme_24);
    }

    /* renamed from: f */
    public final void mo116341f(boolean z) {
        MicView a = mo116336a();
        if (a != null) {
            a.mo17754z().mo116460a(z);
        }
        View view = this.f383631e.getView();
        view.getClass();
        int i = 8;
        view.findViewById(R.id.pronunciationlearning_practice_input_view).setVisibility(true != z ? 8 : 0);
        View view2 = this.f383631e.getView();
        view2.getClass();
        View findViewById = view2.findViewById(R.id.pronunciationlearning_feedback_view);
        if (true != z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo116342g() {
        m229352h();
        boolean z = !m229352h();
        if (z) {
            C141349a aVar = this.f383630d;
            ArrayList arrayList = new ArrayList();
            View view = this.f383631e.getView();
            view.getClass();
            arrayList.add(((TextView) view.findViewById(R.id.pronunciationlearning_expected_text)).getText().toString());
            View view2 = this.f383631e.getView();
            view2.getClass();
            PhonemeView phonemeView = (PhonemeView) view2.findViewById(R.id.pronunciationlearning_expected_pron);
            if (phonemeView.getVisibility() == 0) {
                arrayList.add(phonemeView.mo17754z().f384087a);
            }
            C60870cx c = aVar.mo116381c(arrayList);
            this.f383633g.mo50428h(C46438d.m82809a(c).f121541a, (Object) null, this.f383640n);
            this.f383641o.mo116367g();
        } else {
            this.f383630d.mo116382d();
        }
        mo116341f(z);
    }
}
