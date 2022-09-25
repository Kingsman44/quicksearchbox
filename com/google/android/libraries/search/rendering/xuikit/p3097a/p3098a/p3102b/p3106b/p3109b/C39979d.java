package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3109b;

import com.google.android.libraries.search.video.players.C41592w;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4393a.p4394a.p4395a.C57698b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4393a.p4394a.p4395a.C57699c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.b.d */
/* compiled from: PG */
public final class C39979d {
    /* renamed from: a */
    public static C57699c m69457a(C41592w wVar) {
        C57698b bVar = (C57698b) C57699c.f154153d.createBuilder();
        long millis = wVar.mo44082e().toMillis();
        bVar.copyOnWrite();
        C57699c cVar = (C57699c) bVar.instance;
        int i = 2;
        cVar.f154155a |= 2;
        cVar.f154157c = millis;
        int q = wVar.mo44094q();
        int i2 = q - 1;
        if (q != 0) {
            switch (i2) {
                case 0:
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                default:
                    i = 1;
                    break;
            }
            bVar.copyOnWrite();
            C57699c cVar2 = (C57699c) bVar.instance;
            cVar2.f154156b = i - 1;
            cVar2.f154155a = 1 | cVar2.f154155a;
            return (C57699c) bVar.build();
        }
        throw null;
    }
}
