package com.google.android.libraries.search.p2904c.p2929h.p2930a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2904c.C37628gg;
import com.google.android.libraries.search.p2904c.C37629gh;
import com.google.android.libraries.search.p2904c.p2929h.C37649a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.h.a.c */
/* compiled from: PG */
public final class C37652c implements C37649a {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f100020a = C59071e.m91331h();
    @Deprecated

    /* renamed from: b */
    public static final Map f100021b = C69505av.m100867i(new C69685i(C37628gg.EVENT_FAILURE, Integer.valueOf(R.raw.failure)), new C69685i(C37628gg.EVENT_LISTENING, Integer.valueOf(R.raw.listening)), new C69685i(C37628gg.EVENT_NO_INPUT, Integer.valueOf(R.raw.no_input)), new C69685i(C37628gg.EVENT_OPEN, Integer.valueOf(R.raw.open)), new C69685i(C37628gg.EVENT_SUCCESS, Integer.valueOf(R.raw.success)));

    /* renamed from: c */
    public final Context f100022c;

    /* renamed from: d */
    private final C71422aw f100023d;

    public C37652c(Context context, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f100022c = context;
        this.f100023d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo41046a(C37629gh ghVar) {
        C69664n.m101061g(ghVar, "params");
        return C71663i.m104692e(this.f100023d, (C71424ay) null, new C37651b(ghVar, this, (C69577g) null), 3);
    }
}
