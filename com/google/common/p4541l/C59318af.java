package com.google.common.p4541l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.common.l.af */
/* compiled from: PG */
public final class C59318af extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final Reader f157489a;

    /* renamed from: b */
    private final CharsetEncoder f157490b;

    /* renamed from: c */
    private final byte[] f157491c = new byte[1];

    /* renamed from: d */
    private CharBuffer f157492d;

    /* renamed from: e */
    private ByteBuffer f157493e;

    /* renamed from: f */
    private boolean f157494f;

    /* renamed from: g */
    private boolean f157495g;

    /* renamed from: h */
    private boolean f157496h;

    public C59318af(Reader reader, Charset charset) {
        CharsetEncoder onUnmappableCharacter = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        this.f157489a = reader;
        onUnmappableCharacter.getClass();
        this.f157490b = onUnmappableCharacter;
        onUnmappableCharacter.reset();
        CharBuffer allocate = CharBuffer.allocate(8192);
        this.f157492d = allocate;
        allocate.flip();
        this.f157493e = ByteBuffer.allocate(8192);
    }

    /* renamed from: a */
    private final void m92164a(boolean z) {
        this.f157493e.flip();
        if (!z || this.f157493e.remaining() != 0) {
            this.f157495g = true;
            return;
        }
        int capacity = this.f157493e.capacity();
        this.f157493e = ByteBuffer.allocate(capacity + capacity);
    }

    public final void close() {
        this.f157489a.close();
    }

    public final int read() {
        if (read(this.f157491c) == 1) {
            return this.f157491c[0] & 255;
        }
        return -1;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r12 + r13
            int r1 = r11.length
            com.google.common.base.C58838bb.m90882q(r12, r0, r1)
            r0 = 0
            if (r13 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = r10.f157494f
            r2 = 0
        L_0x000d:
            boolean r3 = r10.f157495g
            r4 = -1
            if (r3 == 0) goto L_0x0039
            int r3 = r13 - r2
            java.nio.ByteBuffer r5 = r10.f157493e
            int r5 = r5.remaining()
            int r3 = java.lang.Math.min(r3, r5)
            java.nio.ByteBuffer r5 = r10.f157493e
            int r6 = r12 + r2
            r5.get(r11, r6, r3)
            int r2 = r2 + r3
            if (r2 == r13) goto L_0x0035
            boolean r3 = r10.f157496h
            if (r3 == 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            r10.f157495g = r0
            java.nio.ByteBuffer r3 = r10.f157493e
            r3.clear()
            goto L_0x0039
        L_0x0035:
            if (r2 <= 0) goto L_0x0038
            return r2
        L_0x0038:
            return r4
        L_0x0039:
            boolean r3 = r10.f157496h
            if (r3 == 0) goto L_0x0040
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L_0x0057
        L_0x0040:
            if (r1 == 0) goto L_0x004b
            java.nio.charset.CharsetEncoder r3 = r10.f157490b
            java.nio.ByteBuffer r5 = r10.f157493e
            java.nio.charset.CoderResult r3 = r3.flush(r5)
            goto L_0x0057
        L_0x004b:
            java.nio.charset.CharsetEncoder r3 = r10.f157490b
            java.nio.CharBuffer r5 = r10.f157492d
            java.nio.ByteBuffer r6 = r10.f157493e
            boolean r7 = r10.f157494f
            java.nio.charset.CoderResult r3 = r3.encode(r5, r6, r7)
        L_0x0057:
            boolean r5 = r3.isOverflow()
            r6 = 1
            if (r5 == 0) goto L_0x0062
            r10.m92164a(r6)
            goto L_0x000d
        L_0x0062:
            boolean r5 = r3.isUnderflow()
            if (r5 == 0) goto L_0x00e3
            if (r1 == 0) goto L_0x0070
            r10.f157496h = r6
            r10.m92164a(r0)
            goto L_0x000d
        L_0x0070:
            boolean r3 = r10.f157494f
            if (r3 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0039
        L_0x0076:
            java.nio.CharBuffer r3 = r10.f157492d
            int r5 = r3.capacity()
            int r3 = r3.limit()
            int r5 = r5 - r3
            if (r5 != 0) goto L_0x00b8
            java.nio.CharBuffer r3 = r10.f157492d
            int r3 = r3.position()
            if (r3 <= 0) goto L_0x0095
            java.nio.CharBuffer r3 = r10.f157492d
            java.nio.CharBuffer r3 = r3.compact()
            r3.flip()
            goto L_0x00b8
        L_0x0095:
            java.nio.CharBuffer r3 = r10.f157492d
            char[] r5 = r3.array()
            int r7 = r3.capacity()
            int r7 = r7 + r7
            char[] r5 = java.util.Arrays.copyOf(r5, r7)
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r5)
            int r7 = r3.position()
            r5.position(r7)
            int r3 = r3.limit()
            r5.limit(r3)
            r10.f157492d = r5
        L_0x00b8:
            java.nio.CharBuffer r3 = r10.f157492d
            int r3 = r3.limit()
            java.io.Reader r5 = r10.f157489a
            java.nio.CharBuffer r7 = r10.f157492d
            char[] r7 = r7.array()
            java.nio.CharBuffer r8 = r10.f157492d
            int r9 = r8.capacity()
            int r8 = r8.limit()
            int r9 = r9 - r8
            int r5 = r5.read(r7, r3, r9)
            if (r5 != r4) goto L_0x00db
            r10.f157494f = r6
            goto L_0x0039
        L_0x00db:
            java.nio.CharBuffer r6 = r10.f157492d
            int r3 = r3 + r5
            r6.limit(r3)
            goto L_0x0039
        L_0x00e3:
            boolean r5 = r3.isError()
            if (r5 == 0) goto L_0x0039
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4541l.C59318af.read(byte[], int, int):int");
    }
}
