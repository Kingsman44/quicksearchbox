package com.google.android.libraries.p11024al.p11025a;

import android.util.Log;
import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.reminders.internal.p10862a.C145803v;
import com.google.android.gms.reminders.model.C145854z;
import com.google.android.gms.reminders.model.Task;
import com.google.common.base.C58817ah;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.al.a.g */
/* compiled from: PG */
final class C147751g implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ int f398695a;

    public C147751g(int i) {
        this.f398695a = i;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C145803v vVar = (C145803v) obj;
        ArrayList arrayList = null;
        if (!vVar.f394179b.mo119097c()) {
            Log.e("CommonRemindersUtils", "ARP call loadReminders failed.");
        } else {
            C145854z zVar = vVar.f394178a;
            if (zVar == null) {
                Log.e("CommonRemindersUtils", "ARP Result returned null buffer.");
            } else {
                int i = this.f398695a;
                if (i != 0) {
                    arrayList = new ArrayList();
                    C143864d dVar = new C143864d(zVar);
                    while (dVar.hasNext()) {
                        arrayList.add((Task) ((Task) dVar.next()).mo119345a());
                        if (arrayList.size() == i) {
                            break;
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                }
                zVar.mo119102b();
            }
        }
        return arrayList;
    }
}
