package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.apps.search.pronunciationlearning.p10635d.C141399r;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicInteger;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.c */
/* compiled from: PG */
public final class C141432c {

    /* renamed from: a */
    public static final C59071e f383895a = C59071e.m91331h();

    /* renamed from: b */
    public final C141431b f383896b;

    /* renamed from: c */
    public final C141399r f383897c;

    /* renamed from: d */
    public final C46439e f383898d;

    /* renamed from: e */
    public final AtomicInteger f383899e = new AtomicInteger(0);

    /* renamed from: f */
    public boolean f383900f;

    /* renamed from: g */
    public boolean f383901g;

    /* renamed from: h */
    public final C1414331 f383902h = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C141432c.this.mo116430b();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C141432c.this.mo116430b();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public C141432c(C141431b bVar, C141399r rVar, C46439e eVar) {
        C69664n.m101061g(rVar, "ttsPlayer");
        C69664n.m101061g(eVar, "futuresMixin");
        this.f383896b = bVar;
        this.f383897c = rVar;
        this.f383898d = eVar;
    }

    /* renamed from: a */
    public final String mo116429a() {
        View requireView = this.f383896b.requireView();
        String obj = ((TextView) requireView.findViewById(R.id.pronunciationlearning_native_sentence)).getText().toString();
        String j = C69764m.m101231j(((TextView) requireView.findViewById(R.id.pronunciationlearning_learning_sentence)).getText().toString(), "____", "blank");
        return obj + ", " + j;
    }

    /* renamed from: b */
    public final void mo116430b() {
        this.f383901g = false;
        View requireView = this.f383896b.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        mo116431c(requireView);
    }

    /* renamed from: c */
    public final void mo116431c(View view) {
        ((ImageButton) view.findViewById(R.id.pronunciationlearning_sentence_tts_button)).setImageDrawable(C1877c.m5125a(view.getContext(), true != this.f383901g ? R.drawable.pronunciationlearning_start_tts_icon : R.drawable.pronunciationlearning_stop_tts_icon));
    }
}
