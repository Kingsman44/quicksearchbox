package com.google.p5261vr.p5262a.p5263a.p5264a;

import android.util.Log;

/* renamed from: com.google.vr.a.a.a.a */
/* compiled from: PG */
public class C67912a {

    /* renamed from: a */
    public final Object f184088a = new Object();

    /* renamed from: b */
    public C67916e f184089b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60047a(C67920i iVar) {
        C67916e eVar;
        synchronized (this.f184088a) {
            eVar = this.f184089b;
        }
        if (eVar != null) {
            C67918g gVar = eVar.f184093a;
            boolean z = ((C67913b) iVar).f184090a;
            Log.d("CheckboxEventLogger", "Received device status update: checkbox=" + z);
            synchronized (gVar.f184097d) {
                if (gVar.f184096c == null) {
                    int size = gVar.f184095b.size();
                    Log.d("CheckboxEventLogger", "First device state, flushing queue with " + size + " events");
                    for (C67922k c : gVar.f184095b) {
                        C67918g.m98194c(gVar.f184094a, iVar, c);
                    }
                    gVar.f184095b.clear();
                }
                C67920i iVar2 = gVar.f184096c;
                if (iVar2 == null || ((C67913b) iVar2).f184090a) {
                    boolean z2 = ((C67913b) iVar).f184090a;
                    Log.d("CheckboxEventLogger", "Updated device state to: checkbox=" + z2);
                    gVar.f184096c = iVar;
                }
            }
        }
    }
}
