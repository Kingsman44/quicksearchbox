package com.google.android.apps.gsa.staticplugins.customtabs;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98634q;
import com.google.android.libraries.p1703d.C20644ah;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.android.libraries.p1703d.C20656l;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.v */
/* compiled from: PG */
public final /* synthetic */ class C98702v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C98583ai f275691a;

    /* renamed from: b */
    public final /* synthetic */ String[] f275692b;

    public /* synthetic */ C98702v(C98583ai aiVar, String[] strArr) {
        this.f275691a = aiVar;
        this.f275692b = strArr;
    }

    public final void run() {
        C98583ai aiVar = this.f275691a;
        String[] strArr = this.f275692b;
        int a = (int) aiVar.f275331g.mo79743a(C90110fh.f250597V);
        if (a > 0 && (r2 = strArr.length) > 0) {
            ArrayList arrayList = new ArrayList();
            for (String parse : strArr) {
                Uri parse2 = Uri.parse(parse);
                String s = aiVar.f275333i.mo79577s(parse2, true, false);
                if (s != null) {
                    parse2 = Uri.parse(s);
                }
                if (!(parse2.getScheme() == null || parse2.getAuthority() == null)) {
                    arrayList.add(Uri.parse(parse2.getScheme() + "://" + parse2.getAuthority()));
                }
                if (arrayList.size() >= a) {
                    break;
                }
            }
            C98634q qVar = aiVar.f275330f;
            C20644ah f = C20645ai.m38752f();
            ((C20656l) f).f57918b = arrayList;
            qVar.mo91235g(f.mo25594a());
        }
    }
}
