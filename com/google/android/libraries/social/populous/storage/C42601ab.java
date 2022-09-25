package com.google.android.libraries.social.populous.storage;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.base.C58872ci;

/* renamed from: com.google.android.libraries.social.populous.storage.ab */
/* compiled from: PG */
final class C42601ab extends C3937a {

    /* renamed from: c */
    final /* synthetic */ C42604ae f111792c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42601ab(C42604ae aeVar) {
        super(8, 9);
        this.f111792c = aeVar;
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C42591z zVar = this.f111792c.f111794a;
        C58872ci b = zVar == null ? null : zVar.mo45632b();
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `ContextualCandidateContexts` (`candidate_id` TEXT NOT NULL, `context_id` TEXT NOT NULL, PRIMARY KEY(`candidate_id`, `context_id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `ContextualCandidates` (`id` TEXT NOT NULL, `proto_bytes` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `ContextualCandidateInfo` (`candidate_id` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`candidate_id`))");
        dVar2.f12902a.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        C42591z zVar2 = this.f111792c.f111794a;
        if (zVar2 != null && b != null) {
            zVar2.mo45638h(64, b, C42576k.f111734a);
        }
    }
}
