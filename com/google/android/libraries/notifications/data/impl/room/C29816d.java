package com.google.android.libraries.notifications.data.impl.room;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p186q.p187a.C4057l;
import com.google.android.libraries.notifications.data.C29828s;

/* renamed from: com.google.android.libraries.notifications.data.impl.room.d */
/* compiled from: PG */
final class C29816d extends C3965r {
    public C29816d(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8303a(C4057l lVar, Object obj) {
        C29828s sVar = (C29828s) obj;
        lVar.mo8204e(1, sVar.mo35121a());
        if (sVar.mo35124d() == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, sVar.mo35124d());
        }
        lVar.mo8204e(3, sVar.mo35122b());
        int g = sVar.mo35128g();
        int i = g - 1;
        if (g != 0) {
            lVar.mo8204e(4, (long) i);
            int f = sVar.mo35127f();
            int i2 = f - 1;
            if (f != 0) {
                lVar.mo8204e(5, (long) i2);
                int e = sVar.mo35125e();
                int i3 = e - 1;
                if (e != 0) {
                    lVar.mo8204e(6, (long) i3);
                    int h = sVar.mo35129h();
                    int i4 = h - 1;
                    if (h != 0) {
                        lVar.mo8204e(7, (long) i4);
                        lVar.mo8204e(8, sVar.mo35123c());
                        lVar.mo8204e(9, sVar.mo35121a());
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "UPDATE OR ABORT `chime_thread_states` SET `id` = ?,`thread_id` = ?,`last_updated_version` = ?,`read_state` = ?,`deletion_status` = ?,`count_behavior` = ?,`system_tray_behavior` = ?,`modified_timestamp` = ? WHERE `id` = ?";
    }
}
