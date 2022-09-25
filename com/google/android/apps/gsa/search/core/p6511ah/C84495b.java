package com.google.android.apps.gsa.search.core.p6511ah;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.search.core.ah.b */
/* compiled from: PG */
final class C84495b extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C84496c f229958a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84495b(C84496c cVar) {
        super("Reset crash count", 1, 8);
        this.f229958a = cVar;
    }

    public final void run() {
        Context context = this.f229958a.f229959a;
        context.getSharedPreferences("uncaught_exception_handler_stats", 4).edit().remove("search_process_crash_count").remove("search_process_crash_count_error_dialog_expected").remove("search_process_unsatisfied_link_error_crash_count").remove("search_process_unsatisfied_link_error_crash_count_error_dialog_expected").remove("event_bus_deadlock_count").remove("event_bus_deadlock_count_error_dialog_expected").apply();
        context.getSharedPreferences("default_process_uncaught_exception_handler_stats", 4).edit().remove("default_process_crash_count").remove("default_process_crash_count_error_dialog_expected").apply();
        context.getSharedPreferences("interactor_process_uncaught_exception_handler_stats", 4).edit().remove("interactor_process_crash_count").remove("interactor_process_crash_count_error_dialog_expected").apply();
        context.getSharedPreferences("consecutive_crash_stats", 4).edit().remove("gsa_crashed_last_time").remove("consecutive_crash_count").apply();
    }
}
