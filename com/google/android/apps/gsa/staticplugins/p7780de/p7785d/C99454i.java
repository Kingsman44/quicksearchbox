package com.google.android.apps.gsa.staticplugins.p7780de.p7785d;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.C99433b;
import com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a.C99439a;
import com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a.C99440b;
import com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a.C99441c;
import com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a.C99442d;
import com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a.C99445g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2186a.C28297a;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.i */
/* compiled from: PG */
public final /* synthetic */ class C99454i implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99458m f278298a;

    public /* synthetic */ C99454i(C99458m mVar) {
        this.f278298a = mVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C28423g gVar;
        C99458m mVar = this.f278298a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) ((C23249a) mVar.f278302a.mo91440f()).mo28725a();
        if (booleanValue && mVar.f278303b.mo56113h()) {
            C99442d dVar = (C99442d) mVar.f278305d.mo27525b();
            Activity activity = (Activity) mVar.f278303b.mo56107c();
            C99433b bVar = mVar.f278306e;
            if (!C99442d.f278262a) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1599;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                if (!dVar.f278263b.mo85405j(C90110fh.f250655b)) {
                    View inflate = LayoutInflater.from(activity).inflate(R.layout.aga_language_picker, (ViewGroup) null);
                    int i = 0;
                    if (dVar.f278263b.mo85405j(C90110fh.f250702h)) {
                        View findViewById = inflate.findViewById(R.id.language_picker_skip_button);
                        dVar.f278264c.f76997b.mo33800a(C28427h.m53115a(120980)).mo33809b(findViewById);
                        findViewById.setOnClickListener(new C99441c(dVar, activity, inflate));
                        findViewById.setVisibility(0);
                    }
                    if (dVar.f278263b.mo85405j(C90110fh.f250701g)) {
                        ((TextView) inflate.findViewById(R.id.language_picker_colored_text)).setText(R.string.language_picker_text_only_voice_products);
                    }
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.aga_picker_grid);
                    if (str != null) {
                        try {
                            gVar = C28297a.m52922b(str);
                        } catch (IllegalArgumentException unused) {
                            gVar = C28297a.m52923c();
                        }
                    } else {
                        gVar = C28297a.m52923c();
                    }
                    C28313c a = dVar.f278264c.f76997b.mo33800a(C28427h.m53115a(108944));
                    a.mo33859g(gVar);
                    a.mo33859g(C28375ak.m53061c(108944));
                    a.mo33810c(activity);
                    TypedArray obtainTypedArray = activity.getResources().obtainTypedArray(R.array.aga_blp_button_text_color);
                    TypedArray obtainTypedArray2 = activity.getResources().obtainTypedArray(R.array.aga_blp_button_background_color);
                    C58485gu<String> d = C89988b.m146551d(dVar.f278263b.mo85403h(C90110fh.f250628aZ));
                    HashMap hashMap = new HashMap();
                    for (String i2 : d) {
                        List i3 = C58869cf.m90936b(new C58903m(':')).mo56155i(i2);
                        if (i3.size() == 2) {
                            hashMap.put((String) i3.get(0), (String) i3.get(1));
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String i4 : d) {
                        List i5 = C58869cf.m90936b(new C58903m(':')).mo56155i(i4);
                        if (i5.size() == 2) {
                            arrayList.add((String) i5.get(0));
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i6 = 0;
                    while (i6 < arrayList.size()) {
                        arrayList2.add(new C99439a((String) arrayList.get(i6), Integer.valueOf(obtainTypedArray.getColor(i6 % obtainTypedArray.length(), i)), Integer.valueOf(obtainTypedArray2.getColor(i6 % obtainTypedArray2.length(), i))));
                        i6++;
                        i = 0;
                    }
                    C58485gu j = C58485gu.m89842j(arrayList2);
                    HashMap hashMap2 = new HashMap();
                    C58485gu d2 = C89988b.m146551d(dVar.f278263b.mo85403h(C90110fh.f250602a));
                    int size = d2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        List i8 = C58869cf.m90936b(new C58903m(':')).mo56155i((String) d2.get(i7));
                        if (i8.size() == 2) {
                            hashMap2.put((String) i8.get(0), (String) i8.get(1));
                        }
                    }
                    C99445g gVar2 = new C99445g(j, new C99440b(dVar, hashMap, bVar, activity, inflate), hashMap2, dVar.f278264c, dVar.f278265d);
                    recyclerView.setAdapter(gVar2);
                    recyclerView.setLayoutManager(new GridLayoutManager(activity, 2, 1));
                    if (gVar2.f278274c) {
                        View findViewById2 = activity.findViewById(16908290);
                        findViewById2.getClass();
                        ViewGroup viewGroup = (ViewGroup) findViewById2;
                        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                            viewGroup.getChildAt(i9).setImportantForAccessibility(4);
                        }
                        ((ViewGroup) activity.findViewById(16908290)).addView(inflate);
                    }
                }
            }
        }
    }
}
