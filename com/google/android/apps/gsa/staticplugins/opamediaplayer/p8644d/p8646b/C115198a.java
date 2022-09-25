package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b;

import android.graphics.BitmapFactory;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.b.a */
/* compiled from: PG */
public final class C115198a {
    /* renamed from: a */
    public static void m190984a(C90464f fVar, C58833ax axVar, byte[] bArr) {
        m190985b(fVar, axVar, bArr, C58729pv.f156485a, BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public static void m190985b(C90464f fVar, C58833ax axVar, byte[] bArr, C58495hd hdVar, String str) {
        C90461c cVar = new C90461c();
        cVar.f252693e = "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK";
        cVar.f252690b = "assistant_settings_help_pixel";
        cVar.f252713y = str;
        cVar.mo84203iI(C58485gu.m89846n(BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        if (axVar.mo56113h() && ((C84275o) axVar.mo56107c()).mo77806l().mo56113h()) {
            C58833ax b = C115485b.m191568b((String) ((C84275o) axVar.mo56107c()).mo77806l().mo56107c());
            if (b.mo56113h()) {
                cVar.mo84200d("OPA Media Player Media Type", ((C52567wn) b.mo56107c()).name());
            }
            cVar.mo84200d("OPA Media Player Media URI", (String) C115485b.m191569c((String) ((C84275o) axVar.mo56107c()).mo77806l().mo56107c()).mo56109e(BuildConfig.FLAVOR));
            if (((C84275o) axVar.mo56107c()).mo77803i().mo56113h()) {
                cVar.mo84200d("OPA Media Player Playback Error", ((Integer) ((C84275o) axVar.mo56107c()).mo77803i().mo56107c()).toString());
            }
        }
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            cVar.mo84200d((String) entry.getKey(), (String) entry.getValue());
        }
        fVar.mo84209b(cVar, 1);
    }
}
