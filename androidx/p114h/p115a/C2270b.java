package androidx.p114h.p115a;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: androidx.h.a.b */
/* compiled from: PG */
class C2270b extends InputStream implements DataInput, InputStreamRetargetInterface {

    /* renamed from: a */
    protected final DataInputStream f6364a;

    /* renamed from: b */
    protected int f6365b;

    /* renamed from: c */
    public ByteOrder f6366c;

    /* renamed from: d */
    private byte[] f6367d;

    public C2270b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f6364a = dataInputStream;
        dataInputStream.mark(0);
        this.f6365b = 0;
        this.f6366c = byteOrder;
    }

    /* renamed from: a */
    public final long mo5638a() {
        return ((long) readInt()) & 4294967295L;
    }

    public final int available() {
        return this.f6364a.available();
    }

    /* renamed from: b */
    public final void mo5640b(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int skip = (int) this.f6364a.skip((long) i3);
            if (skip <= 0) {
                if (this.f6367d == null) {
                    this.f6367d = new byte[8192];
                }
                skip = this.f6364a.read(this.f6367d, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                }
            }
            i2 += skip;
        }
        this.f6365b += i2;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read() {
        this.f6365b++;
        return this.f6364a.read();
    }

    public final boolean readBoolean() {
        this.f6365b++;
        return this.f6364a.readBoolean();
    }

    public final byte readByte() {
        this.f6365b++;
        int read = this.f6364a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f6365b += 2;
        return this.f6364a.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        this.f6365b += bArr.length;
        this.f6364a.readFully(bArr);
    }

    public final int readInt() {
        this.f6365b += 4;
        int read = this.f6364a.read();
        int read2 = this.f6364a.read();
        int read3 = this.f6364a.read();
        int read4 = this.f6364a.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        } else if (this.f6366c == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        } else {
            if (this.f6366c == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            ByteOrder byteOrder = this.f6366c;
            sb.append(byteOrder);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
        }
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        this.f6365b += 8;
        int read = this.f6364a.read();
        int read2 = this.f6364a.read();
        int read3 = this.f6364a.read();
        int read4 = this.f6364a.read();
        int read5 = this.f6364a.read();
        int read6 = this.f6364a.read();
        int read7 = this.f6364a.read();
        int read8 = this.f6364a.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        } else if (this.f6366c == ByteOrder.LITTLE_ENDIAN) {
            return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
        } else {
            int i = read2;
            if (this.f6366c == ByteOrder.BIG_ENDIAN) {
                return (((long) read) << 56) + (((long) i) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            ByteOrder byteOrder = this.f6366c;
            sb.append(byteOrder);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
        }
    }

    public final short readShort() {
        this.f6365b += 2;
        int read = this.f6364a.read();
        int read2 = this.f6364a.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        } else if (this.f6366c == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        } else {
            if (this.f6366c == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            ByteOrder byteOrder = this.f6366c;
            sb.append(byteOrder);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
        }
    }

    public final String readUTF() {
        this.f6365b += 2;
        return this.f6364a.readUTF();
    }

    public final int readUnsignedByte() {
        this.f6365b++;
        return this.f6364a.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.f6365b += 2;
        int read = this.f6364a.read();
        int read2 = this.f6364a.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        } else if (this.f6366c == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        } else {
            if (this.f6366c == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            ByteOrder byteOrder = this.f6366c;
            sb.append(byteOrder);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
        }
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f6364a.read(bArr, i, i2);
        this.f6365b += read;
        return read;
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.f6365b += i2;
        this.f6364a.readFully(bArr, i, i2);
    }

    public C2270b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }
}
