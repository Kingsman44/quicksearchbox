package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.ct */
/* compiled from: PG */
public class C62974ct extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a */
    public boolean f170012a;

    public C62974ct(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static C62974ct m95551a() {
        return new C62974ct("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    static C62974ct m95552b() {
        return new C62974ct("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C62974ct m95553c() {
        return new C62974ct("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static C62974ct m95554d() {
        return new C62974ct("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: e */
    static C62974ct m95555e() {
        return new C62974ct("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: f */
    static C62974ct m95556f() {
        return new C62974ct("Failed to parse the message.");
    }

    /* renamed from: g */
    static C62974ct m95557g() {
        return new C62974ct("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static C62974ct m95558h() {
        return new C62974ct("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: i */
    static C62974ct m95559i() {
        return new C62974ct("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C62974ct(String str) {
        super(str);
    }

    public C62974ct(IOException iOException, byte[] bArr) {
        super("Unable to decode to byte array", iOException);
    }
}
