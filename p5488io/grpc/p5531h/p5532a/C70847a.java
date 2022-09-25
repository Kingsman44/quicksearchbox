package p5488io.grpc.p5531h.p5532a;

import com.google.protobuf.C62906an;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p5488io.grpc.C70157au;
import p5488io.grpc.C70255bz;

/* renamed from: io.grpc.h.a.a */
/* compiled from: PG */
final class C70847a extends InputStream implements InputStreamRetargetInterface, C70157au, C70255bz {

    /* renamed from: a */
    public MessageLite f189007a;

    /* renamed from: b */
    public final C63010eb f189008b;

    /* renamed from: c */
    private ByteArrayInputStream f189009c;

    public C70847a(MessageLite messageLite, C63010eb ebVar) {
        this.f189007a = messageLite;
        this.f189008b = ebVar;
    }

    /* renamed from: a */
    public final int mo61730a(OutputStream outputStream) {
        MessageLite messageLite = this.f189007a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            this.f189007a.writeTo(outputStream);
            this.f189007a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f189009c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        long a = C70850d.m103695a(byteArrayInputStream, outputStream);
        this.f189009c = null;
        return (int) a;
    }

    public final int available() {
        MessageLite messageLite = this.f189007a;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f189009c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    public final int read() {
        MessageLite messageLite = this.f189007a;
        if (messageLite != null) {
            this.f189009c = new ByteArrayInputStream(messageLite.toByteArray());
            this.f189007a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f189009c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        MessageLite messageLite = this.f189007a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.f189007a = null;
                this.f189009c = null;
                return -1;
            } else if (i2 >= serializedSize) {
                C62906an S = C62906an.m95326S(bArr, i, serializedSize);
                this.f189007a.writeTo(S);
                S.mo58788T();
                this.f189007a = null;
                this.f189009c = null;
                return serializedSize;
            } else {
                this.f189009c = new ByteArrayInputStream(this.f189007a.toByteArray());
                this.f189007a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f189009c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
