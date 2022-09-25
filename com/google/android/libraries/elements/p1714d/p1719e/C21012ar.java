package com.google.android.libraries.elements.p1714d.p1719e;

import android.util.Pair;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21322ab;
import com.google.android.libraries.elements.p1714d.p1718d.C20886h;
import com.google.android.libraries.elements.p1714d.p1718d.C20887i;
import com.google.android.libraries.elements.p1714d.p1718d.C20888j;
import com.google.common.p4522b.C58490gz;
import com.google.p370af.C7492e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66260r;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68055ar;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.d.e.ar */
/* compiled from: PG */
public final class C21012ar implements C21271bn {

    /* renamed from: a */
    private static final String f58897a = "ar";

    /* renamed from: b */
    private static final AtomicInteger f58898b = new AtomicInteger();

    /* renamed from: c */
    private final C21259bb f58899c;

    /* renamed from: d */
    private final Map f58900d;

    /* renamed from: e */
    private final Map f58901e;

    public C21012ar(Map map, Map map2, C21259bb bbVar) {
        this.f58899c = bbVar;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            gzVar.mo55429h(Integer.valueOf(((C20887i) entry.getValue()).mo26014a()), (C20887i) entry.getValue());
        }
        C58490gz gzVar2 = new C58490gz(4);
        if (!map2.isEmpty()) {
            for (Map.Entry entry2 : map2.entrySet()) {
                gzVar2.mo55429h(Integer.valueOf(((C20888j) ((Pair) entry2.getValue()).first).mo26020a().mo58810a()), (Pair) entry2.getValue());
            }
        }
        this.f58900d = gzVar.mo55427f(true);
        this.f58901e = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public final int mo26066a() {
        return 322066057;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C20886h hVar;
        Pair pair;
        C68055ar arVar2 = (C68055ar) obj;
        AtomicReference v = zVar.mo26822v();
        if (v == null) {
            this.f58899c.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "scrollStrategyListenerHolder is unavailable", zVar, (Throwable) null);
            return;
        }
        C68044ag agVar = new C68044ag();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int a = arVar2.mo16913a(4);
            if (i < (a != 0 ? arVar2.mo16915c(a) : 0)) {
                int a2 = arVar2.mo16913a(4);
                if (a2 != 0) {
                    int b = arVar2.mo16914b(a2) + (i * 4);
                    agVar.mo16917e(b + arVar2.f24704b.getInt(b), arVar2.f24704b);
                }
                if (agVar.mo60107j() == 1) {
                    C20887i iVar = (C20887i) this.f58900d.get(Integer.valueOf(agVar.mo60106i()));
                    if (iVar != null) {
                        C7492e c = iVar.mo26016c(agVar);
                        C21309p k = C21311r.m40252k();
                        C21230a aVar = (C21230a) k;
                        aVar.f59564e = arVar;
                        k.mo26700c(zVar);
                        aVar.f59565f = zVar.mo26806h();
                        hVar = iVar.mo26015b(c, k.mo26698a());
                    } else {
                        throw new C21260bc("Unknown Flatbuffer extension: " + agVar.mo60106i());
                    }
                } else {
                    if (agVar.mo60107j() == 2 && (pair = (Pair) this.f58901e.get(Integer.valueOf(agVar.mo60106i()))) != null) {
                        try {
                            C21322ab.m40329a(agVar.mo16918f(6), (C63010eb) pair.second, C62921ba.m95368a());
                            C21309p k2 = C21311r.m40252k();
                            ((C21230a) k2).f59564e = arVar;
                            k2.mo26700c(zVar);
                            ((C21230a) k2).f59565f = zVar.mo26806h();
                            k2.mo26698a();
                            hVar = ((C20888j) pair.first).mo26021b();
                        } catch (C62974ct e) {
                            this.f58899c.mo25782a(C66260r.LOG_TYPE_WIRE_FORMAT_ERROR, "Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter. Extension id: " + agVar.mo60106i(), zVar, e);
                        }
                    }
                    hVar = null;
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
                i++;
            } else if (!arrayList.isEmpty()) {
                C21011aq aqVar = new C21011aq(v, arrayList, f58897a + f58898b.incrementAndGet(), this.f58899c, zVar);
                arVar.mo25948v(aqVar);
                arVar.mo25940n(aqVar);
                arVar.mo25935i(aqVar);
                return;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ C7492e mo26067d(ByteBuffer byteBuffer) {
        C68055ar arVar = new C68055ar();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return arVar;
    }
}
