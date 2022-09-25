package com.google.android.apps.gsa.shared.notificationlistening.collection;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.t */
/* compiled from: PG */
final class C90413t implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C90421b bVar = (C90421b) obj;
        C90421b bVar2 = (C90421b) obj2;
        if ((bVar instanceof MessageNotification) && (bVar2 instanceof MessageNotification)) {
            return ((MessageNotification) bVar).f252535E.toString().compareTo(((MessageNotification) bVar2).f252535E.toString());
        }
        C59104x d = C90414u.f252506a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifProcessUtils");
        ((C59052c) ((C59052c) d).mo56372aa(10832)).mo56354G("Verizon message+ notification is not a MessageNotification.notification1 = %s, notification2 = %s", bVar, bVar2);
        throw new RuntimeException("Verizom message+ notification is not a MessageNotification");
    }
}
