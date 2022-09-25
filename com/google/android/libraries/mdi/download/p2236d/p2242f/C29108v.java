package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.util.Log;
import com.google.protobuf.C62906an;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.CRC32;

/* renamed from: com.google.android.libraries.mdi.download.d.f.v */
/* compiled from: PG */
public final class C29108v {
    /* renamed from: a */
    public static ByteBuffer m54030a(Iterable iterable) {
        String str;
        Iterator it = iterable.iterator();
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (it.hasNext()) {
            j += (long) (((MessageLite) it.next()).getSerializedSize() + 12);
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            byte[] array = allocate.array();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                MessageLite messageLite = (MessageLite) it2.next();
                int serializedSize = messageLite.getSerializedSize();
                try {
                    allocate.putInt(serializedSize);
                    int i3 = i + 4;
                    try {
                        messageLite.writeTo(C62906an.m95326S(array, i3, serializedSize));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        allocate.put(array, i3, serializedSize);
                        int i4 = i3 + serializedSize;
                        CRC32 crc32 = new CRC32();
                        crc32.update(array, i4 - serializedSize, serializedSize);
                        allocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        m54032c(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    m54032c(e3);
                    return null;
                }
            }
            allocate.rewind();
            return allocate;
        } catch (IllegalArgumentException e4) {
            Object[] objArr = new Object[1];
            if (j > 1073741824) {
                Locale locale = Locale.US;
                double d = (double) j;
                Double.isNaN(d);
                str = String.format(locale, "%.2fGB", new Object[]{Double.valueOf(d / 1.073741824E9d)});
            } else if (j > 1048576) {
                Locale locale2 = Locale.US;
                double d2 = (double) j;
                Double.isNaN(d2);
                str = String.format(locale2, "%.2fMB", new Object[]{Double.valueOf(d2 / 1048576.0d)});
            } else if (j > 1024) {
                Locale locale3 = Locale.US;
                double d3 = (double) j;
                Double.isNaN(d3);
                str = String.format(locale3, "%.2fKB", new Object[]{Double.valueOf(d3 / 1024.0d)});
            } else {
                str = String.format(Locale.US, "%d Bytes", new Object[]{Long.valueOf(j)});
            }
            objArr[0] = str;
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", objArr), e4);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1 A[LOOP:0: B:1:0x0019->B:28:0x00b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m54031b(java.nio.ByteBuffer r16, java.lang.Class r17, com.google.protobuf.C63010eb r18) {
        /*
            r1 = r16
            java.lang.String r2 = "ProtoLiteUtil"
            java.lang.String r3 = r17.toString()
            int r4 = r16.limit()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r16.limit()
            int r0 = r0 / 1000
            r6 = 1
            int r0 = r0 + r6
            r5.<init>(r0)
        L_0x0019:
            int r0 = r16.position()
            if (r0 >= r4) goto L_0x00e8
            r7 = 0
            r8 = 0
            int r9 = r16.getInt()     // Catch:{ BufferUnderflowException -> 0x00d8 }
            r0 = 2
            if (r9 >= 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            r0[r6] = r3
            java.lang.String r1 = "Invalid message size: %d. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r7
        L_0x003c:
            int r10 = r16.position()
            int r10 = r10 + r9
            int r10 = r10 + 8
            if (r4 >= r10) goto L_0x005d
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r6] = r1
            java.lang.String r1 = "Invalid message size: %d (buffer end is %d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r5
        L_0x005d:
            int r10 = r16.position()
            int r10 = r10 + r9
            long r10 = r1.getLong(r10)
            byte[] r12 = r16.array()
            int r13 = r16.arrayOffset()
            int r14 = r16.position()
            java.util.zip.CRC32 r15 = new java.util.zip.CRC32
            r15.<init>()
            int r13 = r13 + r14
            r15.update(r12, r13, r9)
            long r12 = r15.getValue()
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x00c0
            byte[] r0 = r16.array()
            int r8 = r16.arrayOffset()
            int r10 = r16.position()
            int r8 = r8 + r10
            com.google.protobuf.ba r10 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x009d }
            r14 = r18
            java.lang.Object r0 = r14.mo59016o(r0, r8, r9, r10)     // Catch:{ ct -> 0x009b }
            com.google.protobuf.MessageLite r0 = (com.google.protobuf.MessageLite) r0     // Catch:{ ct -> 0x009b }
            goto L_0x00ae
        L_0x009b:
            r0 = move-exception
            goto L_0x00a0
        L_0x009d:
            r0 = move-exception
            r14 = r18
        L_0x00a0:
            java.lang.String r8 = "Cannot deserialize message of type "
            java.lang.String r10 = r17.toString()
            java.lang.String r8 = r8.concat(r10)
            android.util.Log.e(r2, r8, r0)
            r0 = r7
        L_0x00ae:
            if (r0 != 0) goto L_0x00b1
            return r7
        L_0x00b1:
            r5.add(r0)
            int r0 = r16.position()
            int r0 = r0 + r9
            int r0 = r0 + 8
            r1.position(r0)
            goto L_0x0019
        L_0x00c0:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0[r8] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0[r6] = r1
            java.lang.String r1 = "Corrupt protobuf data, expected CRC: %d computed CRC: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r5
        L_0x00d8:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r3
            java.lang.String r3 = "Buffer underflow. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            android.util.Log.e(r2, r0, r1)
            return r7
        L_0x00e8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.p2242f.C29108v.m54031b(java.nio.ByteBuffer, java.lang.Class, com.google.protobuf.eb):java.util.List");
    }

    /* renamed from: c */
    private static void m54032c(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }
}
