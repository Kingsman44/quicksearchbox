package com.google.android.apps.search.pronunciationlearning.p10638ui.shared;

import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.f */
/* compiled from: PG */
public final class C141513f {

    /* renamed from: a */
    public static final C59071e f384128a = C59071e.m91331h();

    /* renamed from: b */
    public final WordChipsView f384129b;

    /* renamed from: c */
    public final C47770dh f384130c;

    /* renamed from: d */
    public final LayoutInflater f384131d;

    /* renamed from: e */
    public TextView f384132e;

    /* renamed from: f */
    public final List f384133f = C69540x.m100947e("llego", "un", "pedir", "mascotas");

    /* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.f$a */
    /* compiled from: PG */
    public final class C141514a implements C47388b {

        /* renamed from: a */
        public final boolean f384134a;

        public C141514a(boolean z) {
            this.f384134a = z;
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.f$b */
    /* compiled from: PG */
    public final class C141515b implements C47388b {

        /* renamed from: a */
        public final boolean f384135a;

        public C141515b(boolean z) {
            this.f384135a = z;
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.ui.shared.f$c */
    /* compiled from: PG */
    public final class C141516c implements C47388b {

        /* renamed from: a */
        public final String f384136a;

        /* renamed from: b */
        public final String f384137b;

        public C141516c(String str, String str2) {
            C69664n.m101061g(str2, "curWord");
            this.f384136a = str;
            this.f384137b = str2;
        }
    }

    public C141513f(WordChipsView wordChipsView, C47274n nVar, C47770dh dhVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        this.f384129b = wordChipsView;
        this.f384130c = dhVar;
        LayoutInflater from = LayoutInflater.from(nVar);
        C69664n.m101060f(from, "from(context)");
        this.f384131d = from;
        from.inflate(R.layout.pronunciationlearning_word_chips, wordChipsView, false);
    }

    /* renamed from: a */
    public final void mo116543a() {
        TextView textView = this.f384132e;
        if (textView != null) {
            textView.setSelected(false);
        }
        this.f384132e = null;
    }
}
