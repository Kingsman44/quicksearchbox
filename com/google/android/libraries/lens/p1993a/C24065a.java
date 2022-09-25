package com.google.android.libraries.lens.p1993a;

import android.net.Uri;
import com.google.android.libraries.p2259n.p2260a.C29763b;
import com.google.android.libraries.p2259n.p2260a.C29765d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4541l.C59326i;
import com.google.common.p4574q.C60740s;
import com.google.lens.p4696c.p4697a.C62161a;
import com.google.lens.p4707j.C62433bj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.lens.a.a */
/* compiled from: PG */
public final class C24065a {

    /* renamed from: a */
    public static final C58495hd f65747a;

    /* renamed from: b */
    private static final C58495hd f65748b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C29763b.TRANSLATE_ONE_BOX, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.MARKETING, "com.google.android.apps.gsa.staticplugins.deeplink");
        gzVar.mo55429h(C29763b.SCREENSHOT_TRANSLATE, "com.google.android.as");
        gzVar.mo55429h(C29763b.SCREENSHOT_SHOPPING, "com.google.android.as");
        gzVar.mo55429h(C29763b.SEARCH_EDU_MATH_SOLVER, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.SEARCH_EDU_HOMEWORK_QA, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.LENS_IN_GOOGLE_APP_BROWSER, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.SHARE_TRANSLATE, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.SHARE_TO_WHATSAPP_TRANSLATE, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.WEB_IMAGES_GOOGLE_SEARCH_BAR, "com.google.android.googlequicksearchbox");
        gzVar.mo55429h(C29763b.WEB_GOOGLE_SEARCH_BAR, "com.google.android.googlequicksearchbox");
        f65747a = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C29763b.TRANSLATE_ONE_BOX, C62433bj.LENS_IN_TRANSLATE_ONEBOX);
        gzVar2.mo55429h(C29763b.MARKETING, C62433bj.MARKETING);
        gzVar2.mo55429h(C29763b.SCREENSHOT_TRANSLATE, C62433bj.LENS_ON_ANDROID_SCREENSHOT_TRANSLATE);
        gzVar2.mo55429h(C29763b.SCREENSHOT_SHOPPING, C62433bj.LENS_ON_ANDROID_SCREENSHOT_SHOPPING);
        gzVar2.mo55429h(C29763b.SEARCH_EDU_MATH_SOLVER, C62433bj.SEARCH_EDU_MATH_SOLVER);
        gzVar2.mo55429h(C29763b.SEARCH_EDU_HOMEWORK_QA, C62433bj.SEARCH_EDU_HOMEWORK_QA);
        gzVar2.mo55429h(C29763b.LENS_IN_GOOGLE_APP_BROWSER, C62433bj.LENS_IN_GOOGLE_APP_BROWSER);
        gzVar2.mo55429h(C29763b.SHARE_TRANSLATE, C62433bj.SHARE_TRANSLATE);
        gzVar2.mo55429h(C29763b.SHARE_TO_WHATSAPP_TRANSLATE, C62433bj.SHARE_TO_WHATSAPP_TRANSLATE);
        gzVar2.mo55429h(C29763b.WEB_IMAGES_GOOGLE_SEARCH_BAR, C62433bj.WEB_IMAGES_SEARCH_BAR);
        gzVar2.mo55429h(C29763b.WEB_GOOGLE_SEARCH_BAR, C62433bj.WEB_SEARCH_BAR);
        f65748b = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public static C58833ax m44685a(C29763b bVar) {
        C62433bj bjVar = (C62433bj) f65748b.get(bVar);
        return bjVar != null ? C58833ax.m90834k(Integer.valueOf(bjVar.f168594ao)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58833ax m44686b(Uri uri) {
        String queryParameter = uri.getQueryParameter("lens_data");
        if (C58837ba.m90859h(queryParameter)) {
            return C58836b.f156633a;
        }
        C59326i iVar = C62161a.f167811a;
        C69664n.m101061g(queryParameter, "request");
        C29765d dVar = null;
        if (!C69764m.m101229h(queryParameter)) {
            try {
                dVar = (C29765d) C62942bv.parseFrom((C62942bv) C29765d.f80663i, C62161a.f167811a.mo56836k(queryParameter), C62921ba.m95368a());
            } catch (C62974ct | IllegalArgumentException unused) {
            }
        }
        return C58833ax.m90833j(dVar);
    }

    /* renamed from: c */
    public static boolean m44687c(Uri uri) {
        C59326i iVar = C62161a.f167811a;
        String uri2 = uri.toString();
        C69664n.m101061g(uri2, "uri");
        String k = C60740s.m92701a(uri2).mo57131c().mo57143k("lens_data");
        return k != null && !C69764m.m101229h(k);
    }
}
