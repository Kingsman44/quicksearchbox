package com.google.research.p5181a.p5185c;

import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.research.a.c.r */
/* compiled from: PG */
public final class C66327r extends C66316g {

    /* renamed from: a */
    private static final Map f180350a;

    static {
        HashMap hashMap = new HashMap();
        f180350a = hashMap;
        hashMap.put("text/plain", 0);
        hashMap.put("text/html", 1);
        hashMap.put("text/javascript", 2);
        hashMap.put("text/css", 3);
        hashMap.put("image/jpeg", 4);
        hashMap.put("image/png", 5);
        hashMap.put("audio/mpeg", 6);
        hashMap.put("audio/ogg", 7);
        hashMap.put(MediaUtilities.MIME_TYPE, 8);
    }

    /* renamed from: a */
    public final int mo59505a() {
        return 9;
    }

    /* renamed from: b */
    public final C66316g mo59506b() {
        return new C66327r();
    }

    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, 9);
        if (!(aVar2.mo59463f() != 10 || aVar2.mo59466i() == null || aVar2.mo59466i().mo59479b() == null)) {
            String b = aVar2.mo59466i().mo59479b();
            Map map = f180350a;
            if (map.containsKey(b)) {
                oVar.f180409c[((Integer) map.get(b)).intValue()] = 1.0d;
            }
        }
        return oVar;
    }

    public final /* synthetic */ Object clone() {
        return new C66327r();
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "share_type";
    }
}
