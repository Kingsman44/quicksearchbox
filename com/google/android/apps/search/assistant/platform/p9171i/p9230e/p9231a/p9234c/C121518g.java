package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c;

import android.content.Intent;
import com.google.common.p4526f.C59052c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c.g */
/* compiled from: PG */
public final /* synthetic */ class C121518g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121519h f337229a;

    /* renamed from: b */
    public final /* synthetic */ Intent f337230b;

    public /* synthetic */ C121518g(C121519h hVar, Intent intent) {
        this.f337229a = hVar;
        this.f337230b = intent;
    }

    public final void run() {
        C121519h hVar = this.f337229a;
        Intent intent = this.f337230b;
        ((C59052c) ((C59052c) C121525n.f337238a.mo56224b()).mo56372aa(35851)).mo56386p("Received request to start profiling ..");
        long longExtra = intent.getLongExtra("request_id", 0);
        Duration ofSeconds = Duration.ofSeconds(intent.getLongExtra("max_duration_in_seconds", 60));
        String stringExtra = intent.getStringExtra("target_file");
        if (stringExtra == null) {
            ((C59052c) ((C59052c) C121525n.f337238a.mo56226d()).mo56372aa(35852)).mo56386p("Ignored start-profiling request due to missing target file name parameter.");
        } else {
            hVar.f337231a.mo105223b(longExtra, stringExtra, ofSeconds);
        }
    }
}
