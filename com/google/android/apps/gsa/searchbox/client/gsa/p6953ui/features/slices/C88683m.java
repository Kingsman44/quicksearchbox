package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.LiveData;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.SliceView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41666af;
import com.google.android.libraries.searchbox.shared.suggestion.C41667ag;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.m */
/* compiled from: PG */
final class C88683m implements C2333ah, C4141as {

    /* renamed from: d */
    private static final C59071e f239773d = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.m");

    /* renamed from: a */
    public SliceView f239774a;

    /* renamed from: b */
    public LiveData f239775b;

    /* renamed from: c */
    public Suggestion f239776c;

    /* renamed from: e */
    private final Context f239777e;

    /* renamed from: f */
    private final C88709j f239778f;

    /* renamed from: g */
    private final C88701b f239779g;

    /* renamed from: h */
    private final C88682l f239780h;

    /* renamed from: i */
    private final C88675e f239781i;

    /* renamed from: j */
    private String f239782j = BuildConfig.FLAVOR;

    public C88683m(Context context, C88709j jVar, C88701b bVar, Suggestion suggestion, C88682l lVar, C88675e eVar) {
        this.f239777e = context;
        this.f239778f = jVar;
        this.f239779g = bVar;
        this.f239776c = suggestion;
        this.f239780h = lVar;
        this.f239781i = eVar;
    }

    /* renamed from: g */
    private final void m143467g() {
        String str;
        String i = C41670aj.m73076i(this.f239776c);
        PackageManager packageManager = this.f239777e.getPackageManager();
        try {
            str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(i, 0));
        } catch (PackageManager.NameNotFoundException e) {
            C59104x d = f239773d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.u.SliceVC");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(9889)).mo56386p("Could not determine app name for slice with error");
            str = BuildConfig.FLAVOR;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f239777e.getResources().getString(R.string.unknown_app);
        }
        C88682l lVar = this.f239780h;
        String string = this.f239777e.getResources().getString(R.string.slice_loading_error, new Object[]{str});
        SliceView b = lVar.mo82369b();
        RelativeLayout a = lVar.mo82368a();
        if (b != null) {
            b.setVisibility(8);
        }
        if (a == null) {
            C59104x c = C88682l.f239769a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.SliceViewCmp");
            ((C59052c) ((C59052c) c).mo56372aa(9888)).mo56386p("Error layout is not present in slice view component.");
            return;
        }
        a.setVisibility(0);
        ((TextView) a.getChildAt(0)).setText(str);
        ((TextView) a.getChildAt(1)).setText(string);
        int i2 = lVar.f239772d;
        if (i2 == 1) {
            lVar.f239772d = 4;
        } else if (i2 == 2) {
            lVar.f239772d = 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r1 = r1.f13200g;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8726b(androidx.slice.widget.C4147c r4, androidx.slice.SliceItem r5) {
        /*
            r3 = this;
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r5 = r3.f239776c
            com.google.android.libraries.searchbox.shared.suggestion.e r5 = r5.f108907B
            com.google.android.libraries.searchbox.shared.suggestion.ag r5 = r5.f109016j
            if (r5 != 0) goto L_0x000a
            com.google.android.libraries.searchbox.shared.suggestion.ag r5 = com.google.android.libraries.searchbox.shared.suggestion.C41667ag.f108943h
        L_0x000a:
            boolean r5 = r5.f108950f
            if (r5 == 0) goto L_0x0031
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.e r5 = r3.f239781i
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r0 = r3.f239776c
            androidx.slice.widget.SliceView r1 = r3.f239774a
            if (r1 == 0) goto L_0x0025
            androidx.slice.Slice r1 = r1.f13200g
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r1.f13090f
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            java.lang.String r2 = r3.f239782j
            r5.mo82362a(r0, r4, r1, r2)
            com.google.android.apps.gsa.searchbox.ui.b r4 = r3.f239779g
            r4.mo44274C()
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88683m.mo8726b(androidx.slice.widget.c, androidx.slice.SliceItem):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo82370c(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.f239782j = str;
    }

    /* renamed from: d */
    public final void mo82371d() {
        Slice slice;
        SliceView sliceView = this.f239774a;
        if (sliceView != null && (slice = sliceView.f13200g) != null) {
            C4110i iVar = new C4110i(this.f239777e, slice);
            C41667ag agVar = this.f239776c.f108907B.f109016j;
            if (agVar == null) {
                agVar = C41667ag.f108943h;
            }
            int a = C41666af.m73067a(agVar.f108947c);
            if (a != 0 && a == 3 && iVar.f13137c.f13380c.size() > 1) {
                this.f239774a.mo8673h(2);
                this.f239774a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                return;
            }
            this.f239774a.mo8673h(1);
            SliceView sliceView2 = this.f239774a;
            boolean z = this.f239778f.f239846C;
            int i = R.dimen.tightened_core_suggestion_height;
            if (z && mo82372e()) {
                i = R.dimen.slice_view_slider_height;
            }
            sliceView2.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f239777e.getResources().getDimensionPixelSize(i)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo82372e() {
        Slice slice = this.f239774a.f13200g;
        if (slice == null || new C4110i(this.f239777e, slice).mo8615d() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo82373f(Slice slice) {
        return C88681k.m143463a(this.f239777e, slice, this.f239782j, this.f239774a.f13202i.f13326d == 2);
    }

    /* renamed from: hX */
    public final /* synthetic */ void mo774hX(Object obj) {
        List list;
        C4110i iVar;
        Slice slice = (Slice) obj;
        if (!C88682l.m143464c(this.f239780h.f239772d)) {
            if (slice == null) {
                m143467g();
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (C41670aj.m73084q(this.f239776c)) {
                this.f239781i.mo82363c(this.f239776c);
            }
            if (!C41670aj.m73083p(this.f239776c) || mo82373f(slice)) {
                Suggestion suggestion = this.f239776c;
                int i = this.f239778f.f239844A;
                if (C41670aj.m73084q(suggestion)) {
                    this.f239781i.mo82366i(suggestion, this.f239774a, slice);
                } else {
                    this.f239774a.mo8671f(slice);
                }
                SliceView sliceView = this.f239774a;
                List list2 = sliceView.f13201h;
                if (list2 == null || !list2.isEmpty()) {
                    list = sliceView.f13201h;
                } else {
                    list = null;
                }
                if (list != null && list.size() > i) {
                    SliceView sliceView2 = this.f239774a;
                    int i2 = 0;
                    List subList = list.subList(0, i);
                    if (sliceView2.f13200g == null || (iVar = sliceView2.f13199f) == null) {
                        throw new IllegalStateException("Trying to set actions on a view without a slice");
                    }
                    List list3 = iVar.f13138d;
                    if (!(list3 == null || subList == null)) {
                        while (i2 < subList.size()) {
                            if (list3.contains(subList.get(i2))) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder("Trying to set an action that isn't available: ");
                                Object obj2 = subList.get(i2);
                                sb.append(obj2);
                                throw new IllegalArgumentException("Trying to set an action that isn't available: ".concat(String.valueOf(obj2)));
                            }
                        }
                    }
                    if (subList == null) {
                        subList = new ArrayList();
                    }
                    sliceView2.f13201h = subList;
                    sliceView2.mo8672g();
                }
                mo82371d();
                return;
            }
            C59104x d = f239773d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.u.SliceVC");
            ((C59052c) ((C59052c) d).mo56372aa(9891)).mo56386p("The user's query was not found in the slice");
            m143467g();
        }
    }
}
