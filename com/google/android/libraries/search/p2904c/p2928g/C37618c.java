package com.google.android.libraries.search.p2904c.p2928g;

import com.google.android.libraries.search.p2904c.C37566eg;
import com.google.android.libraries.search.p2904c.C37567eh;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.C37593fe;
import com.google.android.libraries.search.p2904c.C37595fg;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.android.libraries.search.p2904c.p2942m.p2944b.C37875c;
import com.google.android.libraries.search.p2904c.p2966s.C37970c;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.c.g.c */
/* compiled from: PG */
public final /* synthetic */ class C37618c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37619d f99960a;

    /* renamed from: b */
    public final /* synthetic */ C37559f f99961b;

    public /* synthetic */ C37618c(C37619d dVar, C37559f fVar) {
        this.f99960a = dVar;
        this.f99961b = fVar;
    }

    public final void run() {
        C37335b bVar;
        C37619d dVar = this.f99960a;
        C37559f fVar = this.f99961b;
        if (dVar.f99969h.mo56113h()) {
            bVar = (C37335b) dVar.f99969h.mo56107c();
        } else {
            bVar = (C37335b) dVar.f99968g.mo56107c();
        }
        while (true) {
            int i = dVar.f99963b;
            byte[] bArr = new byte[i];
            try {
                int read = fVar.read(bArr, 0, i);
                if (read <= 0) {
                    break;
                }
                if (dVar.f99967f.compareAndSet(false, true)) {
                    if (dVar.f99964c.mo56113h()) {
                        ((C37970c) dVar.f99964c.mo56107c()).mo41182b();
                    }
                    if (dVar.f99965d.mo56113h()) {
                        ((C37875c) dVar.f99965d.mo56107c()).mo41094a(read);
                    }
                }
                if (!((Boolean) dVar.f99964c.mo56106b(C37616a.f99958a).mo56109e(false)).booleanValue()) {
                    bVar.mo40890b(read, bArr);
                }
            } catch (IOException e) {
                C38281b bVar2 = dVar.f99966e;
                C37593fe feVar = (C37593fe) C37595fg.f99904g.createBuilder();
                C37566eg egVar = (C37566eg) C37567eh.f99829f.createBuilder();
                C37589fa faVar = C37589fa.OUTCOME_BUFFER_READ_IOEXCEPTION;
                egVar.copyOnWrite();
                C37567eh ehVar = (C37567eh) egVar.instance;
                ehVar.f99832b = faVar.f99887l;
                ehVar.f99831a = 1 | ehVar.f99831a;
                C37567eh ehVar2 = (C37567eh) egVar.build();
                feVar.copyOnWrite();
                C37595fg fgVar = (C37595fg) feVar.instance;
                ehVar2.getClass();
                fgVar.f99908c = ehVar2;
                fgVar.f99907b = 3;
                bVar2.mo41352f((C37595fg) feVar.build());
                C59104x d = C37619d.f99962a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.AudioStreamReader");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52752)).mo56386p("#audio# IOException reading from the AudioStream.");
            }
        }
        if (dVar.f99965d.mo56113h()) {
            ((C37875c) dVar.f99965d.mo56107c()).mo41094a(-1);
        }
        if (dVar.f99964c.mo56113h()) {
            ((C37970c) dVar.f99964c.mo56107c()).mo41181a();
        }
        bVar.mo40891i();
    }
}
