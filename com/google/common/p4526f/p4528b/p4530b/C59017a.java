package com.google.common.p4526f.p4528b.p4530b;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.p4528b.C59033h;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: com.google.common.f.b.b.a */
/* compiled from: PG */
public abstract class C59017a extends C59033h {

    /* renamed from: a */
    private static volatile boolean f156928a = false;

    /* renamed from: b */
    private final Logger f156929b;

    public C59017a(Logger logger) {
        this.f156929b = logger;
    }

    /* renamed from: f */
    private static void m91244f(Logger logger, LogRecord logRecord) {
        Logger parent;
        for (Handler publish : logger.getHandlers()) {
            publish.publish(logRecord);
        }
        if (logger.getUseParentHandlers() && (parent = logger.getParent()) != null) {
            m91244f(parent, logRecord);
        }
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        return this.f156929b.isLoggable(level);
    }

    /* renamed from: d */
    public final String mo56247d() {
        return this.f156929b.getName();
    }

    /* renamed from: e */
    public final void mo56281e(LogRecord logRecord, boolean z) {
        if (!z || this.f156929b.isLoggable(logRecord.getLevel())) {
            this.f156929b.log(logRecord);
            return;
        }
        Filter filter = this.f156929b.getFilter();
        if (filter != null) {
            filter.isLoggable(logRecord);
        }
        if (this.f156929b.getClass() == Logger.class || f156928a) {
            m91244f(this.f156929b, logRecord);
            return;
        }
        Logger logger = Logger.getLogger(String.valueOf(this.f156929b.getName()).concat(".__forced__"));
        try {
            logger.setLevel(Level.ALL);
            logger.log(logRecord);
        } catch (SecurityException unused) {
            f156928a = true;
            Logger.getLogger(BuildConfig.FLAVOR).logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger subclasses.\n");
            m91244f(this.f156929b, logRecord);
        }
    }
}
