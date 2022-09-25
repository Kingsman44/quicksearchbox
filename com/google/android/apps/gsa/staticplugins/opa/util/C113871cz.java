package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.shared.ce;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cz */
/* compiled from: PG */
public final class C113871cz implements ce {

    /* renamed from: a */
    private static final C59071e f315289a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.cz");

    /* renamed from: b */
    private final Context f315290b;

    public C113871cz(Context context) {
        this.f315290b = context;
    }

    /* renamed from: a */
    public final boolean mo100736a(String str, byte[][] bArr) {
        try {
            try {
                PackageInfo packageInfo = this.f315290b.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo == null) {
                    return false;
                }
                if (packageInfo.signatures.length != 1) {
                    return false;
                }
                byte[] byteArray = packageInfo.signatures[0].toByteArray();
                for (byte[] equals : bArr) {
                    if (Arrays.equals(equals, byteArray)) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (RuntimeException e) {
            C59104x c = f315289a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WhListSigVer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(28457)).mo56386p("Exception checking signature");
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo100737b(int i, byte[][] bArr) {
        for (String a : this.f315290b.getPackageManager().getPackagesForUid(i)) {
            if (mo100736a(a, bArr)) {
                return true;
            }
        }
        return false;
    }

    static {
        try {
            "0\u0002§0\u0002e \u0003\u0002\u0001\u0002\u0002\u0004P\u0005|B0\u000b\u0006\u0007*HÎ8\u0004\u0003\u0005\u0000071\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00160\u0014\u0006\u0003U\u0004\u0003\u0013\rAndroid Debug0\u001e\u0017\r120717145250Z\u0017\r220715145250Z071\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00160\u0014\u0006\u0003U\u0004\u0003\u0013\rAndroid Debug0\u0001·0\u0001,\u0006\u0007*HÎ8\u0004\u00010\u0001\u001f\u0002\u0000ýS\u001du\u0012)RßJ.ìäçö\u0011·R<ïD\u0000Ã\u001e?¶Q&iE]@\"QûY=Xú¿Åõº0öËUl×;\u001d4oòf`·kP¥¤è\u0004{\u0010\"ÂO»©×þ·Æ\u001bø;WçÆ¨¦\u0015\u000f\u0004ûöÓÅ\u001eÃ\u00025T\u0013Z\u00162öuó®+a×*ïò\"\u0003\u0019ÑH\u0001Ç\u0002\u0015\u0000`P\u0015#\u000bÌ²¹¢ë\u000bðX\u001cõ\u0002\u0000÷á Ö=ÞË¼«\\6¸W¹y¯»ú:êùWL\u000b=\u0007gQYWºÔYOæq\u0007\u0010´I\u0016q#èL(\u0016\u0013·Ï\t2È¦á<\u0016zT|(à£®\u001e+³¦un£\u000bú!5bñûbz\u0001$;Ì¤ñ¾¨Q¨ßáZå\u0006f^{U%d\u0001L;þÏI*\u0003\u0000\u0002jÑ\u001b×ÕfÒzô9À.Ah¬ýE´¾¼{\u001cwTi?\rB¤üá\u00108BO¦Ñ0RNïöñ78c/¦7)þMF ¸feîðA\u00179\u0001\u0003[\u001cj£\u0018\u0018\r0:¨ÌY#àjo«úuh<E;²\u0007w|òýçÏ±\u001408\u0014ª\u001d÷´=[\"+W\u0006´0\u000b\u0006\u0007*HÎ8\u0004\u0003\u0005\u0000\u0003/\u00000,\u0002\u0014\tÒÑ°G\u0002)µ¾Ò&aÑ\u0012òpÅæ\u001d\u0002\u0014gP\u0002\u0006§Pºx®Ç\u0017O\u0016\u0004ê¢÷".getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
