package com.facebook.litho.p326e;

import androidx.p060c.C0979i;
import androidx.p060c.C0984n;
import com.facebook.litho.p322a.C6088u;
import com.facebook.litho.p322a.C6089v;
import com.facebook.litho.p324c.C6149c;
import com.facebook.litho.p324c.C6150d;
import com.facebook.litho.p324c.C6152f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.litho.e.f */
/* compiled from: PG */
public final class C6217f {

    /* renamed from: a */
    public static C6217f f18380a;

    /* renamed from: b */
    private final ArrayList f18381b = new ArrayList();

    /* renamed from: c */
    private final ArrayList f18382c = new ArrayList();

    /* renamed from: d */
    private final Map f18383d = new HashMap();

    /* renamed from: e */
    private boolean f18384e = false;

    /* renamed from: f */
    private final C6214c f18385f;

    public C6217f(C6214c cVar) {
        this.f18385f = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo13178a(long j) {
        int i;
        if (this.f18384e) {
            this.f18382c.clear();
            if (this.f18381b.size() != 0) {
                C0979i iVar = new C0979i(0);
                C0984n nVar = new C0984n(0);
                int size = this.f18381b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ArrayList arrayList = ((C6220i) this.f18381b.get(i2)).f18391c;
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C6226o oVar = (C6226o) arrayList.get(i3);
                        ArrayList arrayList2 = oVar.f18403b;
                        if (arrayList2 == null) {
                            i = 0;
                        } else {
                            i = arrayList2.size();
                        }
                        if (i == 0) {
                            iVar.add(oVar);
                        } else {
                            nVar.put(oVar, Integer.valueOf(i));
                        }
                    }
                }
                if (!nVar.isEmpty()) {
                    if (iVar.isEmpty()) {
                        throw new C6218g("Graph has nodes, but they represent a cycle with no leaf nodes!");
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addAll(iVar);
                while (!arrayDeque.isEmpty()) {
                    C6226o oVar2 = (C6226o) arrayDeque.pollFirst();
                    this.f18382c.add(oVar2);
                    Iterator it = oVar2.mo13188h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C6226o oVar3 = (C6226o) it.next();
                            int intValue = ((Integer) nVar.get(oVar3)).intValue() - 1;
                            nVar.put(oVar3, Integer.valueOf(intValue));
                            if (intValue == 0) {
                                arrayDeque.addLast(oVar3);
                            } else if (intValue < 0) {
                                throw new C6218g("Detected cycle.");
                            }
                        }
                    }
                }
                if (this.f18382c.size() == nVar.f3122d + iVar.f3101b) {
                    Collections.reverse(this.f18382c);
                    this.f18384e = false;
                } else {
                    throw new C6218g("Had unreachable nodes in graph -- this likely means there was a cycle");
                }
            }
        }
        int size3 = this.f18382c.size();
        int i4 = 0;
        while (i4 < size3) {
            C6226o oVar4 = (C6226o) this.f18382c.get(i4);
            float a = oVar4.mo12765a(j);
            if (j != oVar4.f18405d) {
                oVar4.f18405d = j;
                oVar4.f18404c = a;
                i4++;
            } else {
                throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
            }
        }
        int size4 = this.f18382c.size();
        for (int i5 = 0; i5 < size4; i5++) {
            C6226o oVar5 = (C6226o) this.f18382c.get(i5);
            C6216e eVar = (C6216e) this.f18383d.get(oVar5);
            if (eVar != null && !eVar.f18378a) {
                Iterator it2 = oVar5.mo13188h().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((C6216e) this.f18383d.get((C6226o) it2.next())).f18378a) {
                            break;
                        }
                    } else if (!(oVar5 instanceof C6223l) || ((C6223l) oVar5).mo13183b()) {
                        eVar.f18378a = true;
                    }
                }
            }
        }
        int size5 = this.f18381b.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                C6220i iVar2 = (C6220i) this.f18381b.get(size5);
                ArrayList arrayList3 = iVar2.f18391c;
                int size6 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        C6088u uVar = iVar2.f18394f;
                        if (uVar != null) {
                            C6089v vVar = uVar.f17984a;
                            vVar.mo12781j();
                            vVar.mo12772e();
                        }
                        iVar2.mo13182c();
                    } else if (!((C6216e) this.f18383d.get(arrayList3.get(i6))).f18378a) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo13179b(C6220i iVar) {
        if (iVar.f18392d) {
            this.f18381b.add(iVar);
            ArrayList arrayList = iVar.f18391c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C6226o oVar = (C6226o) arrayList.get(i);
                C6216e eVar = (C6216e) this.f18383d.get(oVar);
                if (eVar != null) {
                    eVar.f18379b++;
                } else {
                    C6216e eVar2 = new C6216e();
                    eVar2.f18379b = 1;
                    this.f18383d.put(oVar, eVar2);
                }
            }
            if (this.f18381b.size() == 1) {
                C6214c cVar = this.f18385f;
                if (cVar.f18373c == null) {
                    throw new RuntimeException("Must set a binding graph first.");
                } else if (!cVar.f18374d) {
                    cVar.f18374d = true;
                    cVar.mo13177a();
                } else {
                    throw new RuntimeException("Tried to start but was already running.");
                }
            }
            this.f18384e = true;
        } else {
            throw new RuntimeException("Expected added GraphBinding to be active: ".concat(iVar.toString()));
        }
    }

    /* renamed from: c */
    public final synchronized void mo13180c(C6220i iVar) {
        if (this.f18381b.remove(iVar)) {
            ArrayList arrayList = iVar.f18391c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C6226o oVar = (C6226o) arrayList.get(i);
                C6216e eVar = (C6216e) this.f18383d.get(oVar);
                int i2 = eVar.f18379b - 1;
                eVar.f18379b = i2;
                if (i2 == 0) {
                    this.f18383d.remove(oVar);
                }
            }
            if (this.f18381b.isEmpty()) {
                C6214c cVar = this.f18385f;
                if (cVar.f18374d) {
                    cVar.f18374d = false;
                    C6150d dVar = cVar.f18371a;
                    C6149c cVar2 = cVar.f18372b;
                    cVar2.f18176a.set((Object) null);
                    if (((C6152f) dVar).f18182b != null) {
                        ((C6152f) dVar).f18182b.removeFrameCallback(cVar2.mo13131a());
                    } else {
                        ((C6152f) dVar).f18181a.removeCallbacks(cVar2.mo13132b());
                    }
                    cVar.f18375e = false;
                    this.f18382c.clear();
                    if (!this.f18383d.isEmpty()) {
                        throw new RuntimeException("Failed to clean up all nodes");
                    }
                } else {
                    throw new RuntimeException("Tried to stop but wasn't running.");
                }
            }
            this.f18384e = true;
        } else {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
    }
}
