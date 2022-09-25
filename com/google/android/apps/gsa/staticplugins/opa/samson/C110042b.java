package com.google.android.apps.gsa.staticplugins.opa.samson;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.b */
/* compiled from: PG */
public final class C110042b {

    /* renamed from: a */
    public static final C59071e f306594a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.b");

    /* renamed from: b */
    final String[] f306595b;

    /* renamed from: c */
    final String[] f306596c;

    /* renamed from: d */
    final String[] f306597d;

    /* renamed from: e */
    final String[] f306598e;

    /* renamed from: f */
    public final C86124t f306599f;

    /* renamed from: g */
    public final l f306600g;

    /* renamed from: h */
    public final C68214a f306601h;

    /* renamed from: i */
    public final C22871g f306602i;

    /* renamed from: j */
    public final int[] f306603j;

    /* renamed from: k */
    boolean f306604k = false;

    /* renamed from: l */
    private final Context f306605l;

    public C110042b(C86124t tVar, Context context, l lVar, C22871g gVar, C68214a aVar) {
        this.f306599f = tVar;
        this.f306605l = context;
        this.f306600g = lVar;
        this.f306602i = gVar;
        this.f306601h = aVar;
        this.f306603j = C60757n.m92752m(tVar.mo79749o(C90014bt.f247119bD));
        this.f306595b = context.getResources().getStringArray(R.array.chip_strings_anytime);
        this.f306596c = context.getResources().getStringArray(R.array.chip_strings_afternoon);
        this.f306597d = context.getResources().getStringArray(R.array.chip_strings_evening);
        this.f306598e = context.getResources().getStringArray(R.array.chip_strings_night);
    }

    /* renamed from: a */
    public final String[] mo98331a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = new C72210d().mo63372k();
        int[] iArr = this.f306603j;
        if (k >= iArr[0] && k < iArr[1]) {
            arrayList2.add(this.f306605l.getString(R.string.routine_morning));
        } else if (k >= iArr[1] && k < iArr[2]) {
            Collections.addAll(arrayList, this.f306596c);
        } else if (k < iArr[2] || k >= iArr[3]) {
            arrayList2.add(this.f306605l.getString(R.string.routine_night));
            Collections.addAll(arrayList, this.f306598e);
        } else {
            Collections.addAll(arrayList, this.f306597d);
        }
        Collections.addAll(arrayList, this.f306595b);
        if (this.f306604k) {
            arrayList.add(this.f306605l.getString(R.string.play_music_anytime));
        }
        Collections.shuffle(arrayList);
        arrayList2.addAll(arrayList);
        return (String[]) arrayList2.toArray(new String[0]);
    }
}
