package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.apps.search.pronunciationlearning.p10628a.C141305l;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10632b.C141349a;
import com.google.android.apps.search.pronunciationlearning.p10630c.p10632b.C141357i;
import com.google.android.apps.search.pronunciationlearning.p10635d.C141399r;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.C141466b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.MicView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.C141501e;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54534d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b.c */
/* compiled from: PG */
public final class C141444c {

    /* renamed from: a */
    public static final C59071e f383923a = C59071e.m91331h();

    /* renamed from: b */
    public final C141512e f383924b;

    /* renamed from: c */
    public final String f383925c;

    /* renamed from: d */
    public final C141399r f383926d;

    /* renamed from: e */
    public final C46439e f383927e;

    /* renamed from: f */
    public final C46801dp f383928f;

    /* renamed from: g */
    public final C141443b f383929g;

    /* renamed from: h */
    public final C141501e f383930h;

    /* renamed from: i */
    public final C141349a f383931i;

    /* renamed from: j */
    public final C141305l f383932j;

    /* renamed from: k */
    public final C141330c f383933k;

    /* renamed from: l */
    public boolean f383934l;

    /* renamed from: m */
    public boolean f383935m;

    /* renamed from: n */
    public boolean f383936n;

    /* renamed from: o */
    public int f383937o;

    /* renamed from: p */
    public final C58872ci f383938p = new C58872ci(C58274c.f155808a);

    /* renamed from: q */
    public final C1414484 f383939q = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C141444c.this.mo116443c();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C141444c.this.mo116443c();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: r */
    public final C1414462 f383940r = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C141444c.this.mo116443c();
            C141444c.this.mo116445e(4);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C141444c.this.mo116443c();
            C141444c cVar = C141444c.this;
            View requireView = cVar.f383929g.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            cVar.mo116442b(requireView);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: s */
    public final C1414506 f383941s = new C46440f() {
        /* renamed from: d */
        private final void m229564d() {
            C141444c cVar = C141444c.this;
            cVar.f383936n = false;
            View view = cVar.f383929g.getView();
            if (view != null) {
                ((PhonemeView) view.findViewById(R.id.pronunciationlearning_expected_pron)).mo17754z().mo116517a(cVar.f383936n);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            m229564d();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            m229564d();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: t */
    public final C1414495 f383942t = new C46440f() {
        /* renamed from: d */
        private final void m229560d() {
            C141444c cVar = C141444c.this;
            cVar.f383935m = false;
            View view = cVar.f383929g.getView();
            if (view != null) {
                ((PhonemeView) view.findViewById(R.id.pronunciationlearning_actual_pron)).mo17754z().mo116517a(cVar.f383935m);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            m229560d();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            m229560d();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: u */
    public final C1414473 f383943u = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C141444c.f383923a.mo56224b()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41706));
            cVar.mo56386p("Fetch pronto response failed.");
            C141444c.this.mo116445e(4);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            int i;
            Void voidR = (Void) obj;
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj2;
            C69664n.m101061g(parcelableProto, "result");
            C54534d dVar = (C54534d) parcelableProto.mo58938a(C54534d.f143186b, C62921ba.m95368a());
            C141444c cVar = C141444c.this;
            C69664n.m101060f(dVar, "prontoResponse");
            TextView textView = (TextView) cVar.f383929g.requireView().findViewById(R.id.pronunciationlearning_expected_sentence);
            int a = cVar.f383930h.mo116523a(dVar, textView.getText().toString(), textView, (PhonemeView) cVar.f383929g.requireView().findViewById(R.id.pronunciationlearning_expected_pron), (PhonemeView) cVar.f383929g.requireView().findViewById(R.id.pronunciationlearning_actual_pron));
            boolean z = a >= 0;
            C141330c cVar2 = cVar.f383933k;
            C62722b bVar = z ? C62722b.OK : C62722b.INTERNAL;
            long a2 = cVar.f383938p.mo56158a(TimeUnit.MILLISECONDS);
            int length = textView.getText().toString().length();
            if (z) {
                int i2 = cVar.f383937o + 1;
                cVar.f383937o = i2;
                i = i2;
            } else {
                i = cVar.f383937o;
            }
            cVar2.mo116372l(bVar, a2, a, length, 5, i, C69496am.f185918a);
            cVar.f383938p.mo56160e();
            if (a > 0) {
                cVar.mo116445e(2);
            } else if (a == 0) {
                cVar.mo116445e(3);
            } else {
                cVar.mo116445e(4);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: v */
    public final C1414451 f383944v = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C141444c.f383923a.mo56224b()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41704));
            cVar.mo56386p("Audio recording failed.");
            C141444c.this.mo116445e(4);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141357i iVar = (C141357i) obj;
            C69664n.m101061g(iVar, "recognitionUpdate");
            MicView micView = (MicView) C141444c.this.f383929g.requireView().findViewById(R.id.pronunciationlearning_mic_container);
            int i = iVar.f383750a;
            if (i == 1) {
                micView.mo17754z().f383983b = iVar.f383750a == 1 ? ((Integer) iVar.f383751b).intValue() : 0;
            } else if (i == 2) {
                micView.mo17754z().mo116461b();
                C141444c.this.f383938p.mo56160e();
                C141444c.this.f383938p.mo56161f();
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    public C141444c(C141512e eVar, String str, C141399r rVar, C46439e eVar2, C46801dp dpVar, C141443b bVar, C141501e eVar3, C141349a aVar, C141305l lVar, C141330c cVar) {
        C69664n.m101061g(eVar, "uiStringProvider");
        C69664n.m101061g(rVar, "ttsPlayer");
        C69664n.m101061g(eVar2, "futuresMixin");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(eVar3, "prontoFeedbackParser");
        C69664n.m101061g(aVar, "recognitionDataService");
        C69664n.m101061g(cVar, "appFlowLogger");
        this.f383924b = eVar;
        this.f383925c = str;
        this.f383926d = rVar;
        this.f383927e = eVar2;
        this.f383928f = dpVar;
        this.f383929g = bVar;
        this.f383930h = eVar3;
        this.f383931i = aVar;
        this.f383932j = lVar;
        this.f383933k = cVar;
        cVar.mo116368h();
    }

    /* renamed from: a */
    public final void mo116441a() {
        this.f383933k.mo116369i(C62722b.OK);
        this.f383929g.requireActivity().finish();
    }

    /* renamed from: b */
    public final void mo116442b(View view) {
        C69664n.m101061g(view, "view");
        if (!((MicView) this.f383929g.requireView().findViewById(R.id.pronunciationlearning_mic_container)).mo17754z().f383982a) {
            this.f383932j.mo116335d();
            mo116445e(1);
            C46439e eVar = this.f383927e;
            C141349a aVar = this.f383931i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(((TextView) this.f383929g.requireView().findViewById(R.id.pronunciationlearning_expected_sentence)).getText().toString());
            PhonemeView phonemeView = (PhonemeView) this.f383929g.requireView().findViewById(R.id.pronunciationlearning_expected_pron);
            if (phonemeView.getVisibility() == 0) {
                String str = phonemeView.mo17754z().f384087a;
                C69664n.m101060f(str, "expectedPron.peer().wordText");
                arrayList.add(str);
            }
            C46438d a = C46438d.m82809a(aVar.mo116381c(arrayList));
            eVar.mo50428h(a.f121541a, (Object) null, this.f383943u);
            this.f383933k.mo116367g();
            return;
        }
        this.f383931i.mo116382d();
    }

    /* renamed from: c */
    public final void mo116443c() {
        this.f383934l = false;
        View requireView = this.f383929g.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        mo116444d(requireView);
    }

    /* renamed from: d */
    public final void mo116444d(View view) {
        ((ImageButton) view.findViewById(R.id.pronunciationlearning_sentence_tts_button)).setImageDrawable(C1877c.m5125a(view.getContext(), true != this.f383934l ? R.drawable.pronunciationlearning_start_tts_icon : R.drawable.pronunciationlearning_stop_tts_icon));
    }

    /* renamed from: e */
    public final void mo116445e(int i) {
        String str;
        View findViewById = this.f383929g.requireView().findViewById(R.id.pronunciationlearning_mic_icon);
        C69664n.m101060f(findViewById, "fragment.requireView().f…ciationlearning_mic_icon)");
        int i2 = 8;
        boolean z = false;
        findViewById.setVisibility(i == 1 ? 0 : 8);
        View findViewById2 = this.f383929g.requireView().findViewById(R.id.pronunciationlearning_practice_again_button);
        C69664n.m101060f(findViewById2, "fragment\n      .requireV…ng_practice_again_button)");
        findViewById2.setVisibility(i != 1 ? 0 : 8);
        View findViewById3 = this.f383929g.requireView().findViewById(R.id.pronunciationlearning_phoneme_views);
        C69664n.m101060f(findViewById3, "fragment.requireView().f…onlearning_phoneme_views)");
        findViewById3.setVisibility(i == 2 ? 0 : 8);
        View findViewById4 = this.f383929g.requireView().findViewById(R.id.pronunciationlearning_good_job_icon);
        C69664n.m101060f(findViewById4, "fragment\n      .requireV…onlearning_good_job_icon)");
        if (i == 3) {
            i2 = 0;
        }
        findViewById4.setVisibility(i2);
        C141466b a = ((MicView) this.f383929g.requireView().findViewById(R.id.pronunciationlearning_mic_container)).mo17754z();
        if (i == 1) {
            z = true;
        }
        a.mo116460a(z);
        TextView textView = (TextView) this.f383929g.requireView().findViewById(R.id.pronunciationlearning_hint_message);
        int i3 = i - 1;
        if (i3 == 0) {
            str = this.f383929g.getResources().getString(R.string.pronunciationlearning_expected_text_title);
        } else if (i3 == 1) {
            str = this.f383929g.getResources().getString(R.string.pronunciationlearning_half_sheet_feedback_hint);
        } else if (i3 == 2) {
            str = this.f383929g.getResources().getString(R.string.pronunciationlearning_good_job_text);
        } else if (i3 != 3) {
            str = this.f383929g.getResources().getString(R.string.pronunciationlearning_expected_text_title);
        } else {
            str = this.f383929g.getResources().getString(R.string.pronunciationlearning_empty_feedback_error);
        }
        textView.setText(str);
    }
}
