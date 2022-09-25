package com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a;

import com.google.android.libraries.elements.C20697c;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.elements.d.e.a.a.a */
/* compiled from: PG */
final class C20934a implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ CommandHandler f58705a;

    /* renamed from: b */
    final /* synthetic */ ExecutorRegistry f58706b;

    public C20934a(CommandHandler commandHandler, ExecutorRegistry executorRegistry) {
        this.f58705a = commandHandler;
        this.f58706b = executorRegistry;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        C20697c.m38871a();
        CommandHandlerResolver create = CommandHandlerResolver.create(this.f58705a, this.f58706b);
        if (create != null) {
            return create;
        }
        throw new C21260bc("Error creating djinni CommandHandlerResolver.");
    }
}
