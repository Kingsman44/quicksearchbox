package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.k */
/* compiled from: PG */
public final class C4555k extends C3937a {

    /* renamed from: c */
    public static final C4555k f14384c = new C4555k();

    private C4555k() {
        super(6, 7);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
