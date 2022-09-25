package com.google.android.libraries.elements.internal;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protobuf.C62903ak;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.p5283a.p5284a.C68044ag;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.elements.internal.q */
/* compiled from: PG */
public final /* synthetic */ class C21356q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C68044ag f59721a;

    /* renamed from: b */
    public final /* synthetic */ C21259bb f59722b;

    /* renamed from: c */
    public final /* synthetic */ C21319z f59723c;

    public /* synthetic */ C21356q(C68044ag agVar, C21259bb bbVar, C21319z zVar) {
        this.f59721a = agVar;
        this.f59722b = bbVar;
        this.f59723c = zVar;
    }

    public final Object call() {
        C68044ag agVar = this.f59721a;
        C21259bb bbVar = this.f59722b;
        C21319z zVar = this.f59723c;
        if (agVar.mo60107j() != 2) {
            bbVar.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "Command extension: invalid format: ".concat(String.valueOf(C21359t.m40384j(agVar))), zVar, (Throwable) null);
            return CommandOuterClass$Command.f179510a;
        } else if (agVar.mo60106i() == 0) {
            bbVar.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "Command extension: invalid identifier: ".concat(String.valueOf(C21359t.m40384j(agVar))), C21319z.f59680u, (Throwable) null);
            return CommandOuterClass$Command.f179510a;
        } else {
            int h = agVar.mo60105h();
            byte[] bArr = new byte[h];
            if (agVar.mo60105h() > 0) {
                agVar.mo16918f(6).get(bArr);
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C62903ak akVar = new C62903ak(byteArrayOutputStream, 4096);
                akVar.mo58785B(agVar.mo60106i(), bArr, h);
                akVar.mo58759X();
                return (CommandOuterClass$Command) C62942bv.parseFrom((C62942bv) CommandOuterClass$Command.f179510a, byteArrayOutputStream.toByteArray(), C62921ba.m95368a());
            } catch (C62974ct unused) {
                bbVar.mo25782a(C66260r.LOG_TYPE_WIRE_FORMAT_ERROR, "Command extension: invalid data: ".concat(String.valueOf(C21359t.m40384j(agVar))), C21319z.f59680u, (Throwable) null);
                return CommandOuterClass$Command.f179510a;
            } catch (IOException unused2) {
                bbVar.mo25782a(C66260r.LOG_TYPE_WIRE_FORMAT_ERROR, "Error wrapping Command extension: ".concat(String.valueOf(C21359t.m40384j(agVar))), C21319z.f59680u, (Throwable) null);
                return CommandOuterClass$Command.f179510a;
            }
        }
    }
}
