package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;
import androidx.work.C4412h;
import androidx.work.C4632m;

/* renamed from: androidx.work.impl.b.ak */
/* compiled from: PG */
final class C4476ak extends C3966s {
    public C4476ak(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C4470ae aeVar = (C4470ae) obj;
        String str = aeVar.f14217b;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        lVar.mo8204e(2, (long) C4493ba.m12808d(aeVar.f14218c));
        String str2 = aeVar.f14219d;
        if (str2 == null) {
            lVar.mo8205f(3);
        } else {
            lVar.mo8206g(3, str2);
        }
        String str3 = aeVar.f14220e;
        if (str3 == null) {
            lVar.mo8205f(4);
        } else {
            lVar.mo8206g(4, str3);
        }
        byte[] e = C4632m.m13036e(aeVar.f14221f);
        if (e == null) {
            lVar.mo8205f(5);
        } else {
            lVar.mo8201c(5, e);
        }
        byte[] e2 = C4632m.m13036e(aeVar.f14222g);
        if (e2 == null) {
            lVar.mo8205f(6);
        } else {
            lVar.mo8201c(6, e2);
        }
        lVar.mo8204e(7, aeVar.f14223h);
        lVar.mo8204e(8, aeVar.f14224i);
        lVar.mo8204e(9, aeVar.f14225j);
        lVar.mo8204e(10, (long) aeVar.f14227l);
        lVar.mo8204e(11, (long) C4493ba.m12805a(aeVar.f14228m));
        lVar.mo8204e(12, aeVar.f14229n);
        lVar.mo8204e(13, aeVar.f14230o);
        lVar.mo8204e(14, aeVar.f14231p);
        lVar.mo8204e(15, aeVar.f14232q);
        lVar.mo8204e(16, aeVar.f14233r ? 1 : 0);
        lVar.mo8204e(17, (long) C4493ba.m12807c(aeVar.f14234s));
        lVar.mo8204e(18, (long) aeVar.f14235t);
        lVar.mo8204e(19, (long) aeVar.f14236u);
        C4412h hVar = aeVar.f14226k;
        if (hVar != null) {
            lVar.mo8204e(20, (long) C4493ba.m12806b(hVar.f14081b));
            lVar.mo8204e(21, hVar.f14082c ? 1 : 0);
            lVar.mo8204e(22, hVar.f14083d ? 1 : 0);
            lVar.mo8204e(23, hVar.f14084e ? 1 : 0);
            lVar.mo8204e(24, hVar.f14085f ? 1 : 0);
            lVar.mo8204e(25, hVar.f14086g);
            lVar.mo8204e(26, hVar.f14087h);
            byte[] j = C4493ba.m12814j(hVar.f14088i);
            if (j == null) {
                lVar.mo8205f(27);
            } else {
                lVar.mo8201c(27, j);
            }
        } else {
            lVar.mo8205f(20);
            lVar.mo8205f(21);
            lVar.mo8205f(22);
            lVar.mo8205f(23);
            lVar.mo8205f(24);
            lVar.mo8205f(25);
            lVar.mo8205f(26);
            lVar.mo8205f(27);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
