package com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b;

import org.p5633c.p5634a.C72290n;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.b.j */
/* compiled from: PG */
public enum C91001j {
    UNKNOWN(0),
    ENTRY_PROVIDER_EVENT_LOGGER(C72290n.m106812c(1), false, 1),
    SPEECH_LOGGER(C72290n.m106812c(30), true, 2),
    SMARTSPACE_UPDATE_LOGGER(3),
    ENTRY_PROVIDER_OBSERVABLE_EVENT_LOGGER(4),
    NEXT_PAGE_EVENT_LOGGER(5),
    CHIME_NOTIFICATION(C72290n.m106812c(2), false, 6),
    NOTIFICATION_FILTER_IMPL(7),
    ENTRY_TREE_READER_WRITER_EVENT_LOGGER(C72290n.m106812c(1), false, 8),
    NOW_SERVICES_ACCOUNT_HANDLER(C72290n.m106812c(7), false, 9),
    REQUEST_QUEUE(C72290n.m106812c(1), false, 10),
    ENTRY_TREE_READER_WRITER_CONTENT_HISTORY(C72290n.m106813d(4), false, 11),
    NOW_CONTROLLER_EVENT_LOGGER(C72290n.m106813d(1), false, 12),
    NOTIFICATION_ACTION_UPLOAD(C72290n.m106812c(2), false, 13),
    PCP_EVENT_LOGGER(C72290n.m106812c(1), false, 14);
    

    /* renamed from: p */
    public final C72290n f254223p;

    /* renamed from: q */
    public final boolean f254224q;

    /* renamed from: r */
    public final long f254225r;

    private C91001j(long j) {
        this(r10, r11, C72290n.m106812c(1), true, j);
    }

    private C91001j(C72290n nVar, boolean z, long j) {
        this.f254223p = nVar;
        this.f254225r = j;
        this.f254224q = z;
    }
}
