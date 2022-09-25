package com.google.android.libraries.lens.view.p2133i.p2136c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26896a;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26900e;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26901f;
import com.google.lens.p4707j.C62575i;
import com.google.lens.p4707j.C62576j;
import com.google.p4017at.p4056g.p4057a.p4058a.C54069u;
import com.google.p4017at.p4056g.p4057a.p4058a.C54071w;
import com.google.protobuf.C62972cr;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.view.i.c.j */
/* compiled from: PG */
public final class C26914j implements C26901f {
    /* renamed from: b */
    private static String m49854b(String str) {
        ByteBuffer wrap = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        if (wrap.limit() <= 3712) {
            return str;
        }
        wrap.limit(3712);
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        newDecoder.onMalformedInput(CodingErrorAction.IGNORE);
        try {
            return newDecoder.decode(wrap).toString();
        } catch (CharacterCodingException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    public final C26900e mo32279a(C62576j jVar) {
        int b = C62575i.m94799b(jVar.f168941c);
        if (b == 0) {
            b = 1;
        }
        if (b - 2 != 0) {
            return new C26896a(1, Optional.empty());
        }
        String I = jVar.f168940b.mo59170I(C62972cr.f170009a);
        String b2 = m49854b(I);
        int i = b2.length() < I.length() ? 3 : 2;
        C54069u uVar = (C54069u) C54071w.f141876c.createBuilder();
        uVar.copyOnWrite();
        C54071w wVar = (C54071w) uVar.instance;
        b2.getClass();
        wVar.f141878a = 1;
        wVar.f141879b = b2;
        return new C26896a(i, Optional.m71637of((C54071w) uVar.build()));
    }
}
