package com.google.android.libraries.elements.internal;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.p370af.C7494g;
import com.google.p370af.C7496i;
import com.google.protos.youtube.elements.C66260r;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.elements.internal.as */
/* compiled from: PG */
public final class C21339as extends C7494g {

    /* renamed from: b */
    private static final Charset f59701b = StandardCharsets.UTF_8;

    /* renamed from: c */
    private static final C7494g f59702c = new C7496i();

    /* renamed from: d */
    private final C21259bb f59703d;

    public C21339as(C21259bb bbVar) {
        this.f59703d = bbVar;
    }

    /* renamed from: a */
    public final int mo16919a(CharSequence charSequence) {
        try {
            return C7496i.m22764e(charSequence);
        } catch (IllegalArgumentException e) {
            this.f59703d.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, "Failed to encode UTF-8 string length", C21319z.f59680u, e);
            return 0;
        }
    }

    /* renamed from: b */
    public final String mo16920b(ByteBuffer byteBuffer, int i, int i2) {
        try {
            if (byteBuffer.hasArray()) {
                return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, f59701b);
            }
            return f59702c.mo16920b(byteBuffer, i, i2);
        } catch (IllegalArgumentException e) {
            this.f59703d.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, "Failed to decode UTF-8 string", C21319z.f59680u, e);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    public final void mo16921c(CharSequence charSequence, ByteBuffer byteBuffer) {
        try {
            f59702c.mo16921c(charSequence, byteBuffer);
        } catch (IllegalArgumentException e) {
            this.f59703d.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, "Failed to encode UTF-8 string", C21319z.f59680u, e);
        }
    }
}
