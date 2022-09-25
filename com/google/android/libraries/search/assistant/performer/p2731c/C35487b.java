package com.google.android.libraries.search.assistant.performer.p2731c;

import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51823ak;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.performer.c.b */
/* compiled from: PG */
public final class C35487b implements C35472h {

    /* renamed from: a */
    public final C35470f f93197a;

    /* renamed from: b */
    private final C71422aw f93198b;

    public C35487b(C71422aw awVar, C35470f fVar) {
        this.f93198b = awVar;
        this.f93197a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        if (!C69664n.m101066l(dyVar.f135936b, "ui.SHOW_CAST_DEVICE_CONTROL")) {
            return C60856cj.m92899h(new C35469e("ui.SHOW_CAST_DEVICE_CONTROL"));
        }
        try {
            Optional c = C36183e.m64585c(dyVar, "show_cast_device_control_args", C51823ak.f135960d.getParserForType());
            C69664n.m101060f(c, "getArgument(\n          c…olArgs.parser()\n        )");
            if (c.isEmpty()) {
                return C60856cj.m92899h(new C35471g("Failed to parse ShowCastDeviceControlArgs"));
            }
            Object obj = c.get();
            C69664n.m101060f(obj, "argsOptional.get()");
            return C71663i.m104692e(this.f93198b, (C71424ay) null, new C35486a((C51823ak) obj, this, (C69577g) null), 3);
        } catch (C62974ct e) {
            return C60856cj.m92899h(new C35471g((Throwable) e));
        }
    }
}
