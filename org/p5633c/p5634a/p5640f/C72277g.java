package org.p5633c.p5634a.p5640f;

import java.io.DataInput;
import java.io.IOException;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.f.g */
/* compiled from: PG */
public final class C72277g {
    /* renamed from: a */
    static long m106749a(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8));
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    /* renamed from: b */
    public static C72288l m106750b(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return new C72272b(C72275e.m106741c(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            C72279i iVar = new C72279i(str, dataInput.readUTF(), (int) m106749a(dataInput), (int) m106749a(dataInput));
            return iVar.equals(C72288l.f192416b) ? C72288l.f192416b : iVar;
        } else if (readUnsignedByte == 80) {
            return C72275e.m106741c(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }
}
