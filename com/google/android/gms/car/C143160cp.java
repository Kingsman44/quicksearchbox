package com.google.android.gms.car;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;

/* renamed from: com.google.android.gms.car.cp */
/* compiled from: PG */
final class C143160cp {
    /* renamed from: a */
    public static void m232264a(Context context, String str, boolean z) {
        if (str.equals("com.google.android.projection.bumblebee") || str.equals("com.google.android.projection.gearhead")) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures.length == 1) {
                Signature signature = new Signature(Base64.decode("MIIDvTCCAqWgAwIBAgIJAMePnkuTQTAGMA0GCSqGSIb3DQEBBQUAMHUxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDERMA8G\nA1UEAwwIZ2VhcmhlYWQwHhcNMTQwNTI3MjMwNTM0WhcNNDExMDEyMjMwNTM0WjB1\nMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91\nbnRhaW4gVmlldzEUMBIGA1UECgwLR29vZ2xlIEluYy4xEDAOBgNVBAsMB0FuZHJv\naWQxETAPBgNVBAMMCGdlYXJoZWFkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\nCgKCAQEA050XDkNIsVRMX2wTvVplpCu4OtnyNK2v5B7PS+DggmH2yuZiwpTurdKD\nQ9R9UzxH9U4lsC+mIxXkiBYKIWNVgMtiTgxkEy7cgWvdYHgNYpFu8IxZKYDyXes+\n02pfvpu63MIBD/PnvVFipo1oUrbfetj+mroEpjnA71gUS0Ok+H6XWWsmb8xFHQVM\noZWEIzsUJ2nhm8EcnPkAPfNZAG++XLPROoRQCaswyYsd42JuYAP3CwZuhDcUbMWm\nk7rBi9BVQ8gmkrbwqo94A7qStLUp3NyCmlKSWHaZ05SspEPwsfctka0oXG5bhgT6\n67EMCzQ+YsFN1oJRL7Qq+mMQjFJs3wIDAQABo1AwTjAdBgNVHQ4EFgQUGvBfYNeu\n6JSJUnJZCiaBGsnXztswHwYDVR0jBBgwFoAUGvBfYNeu6JSJUnJZCiaBGsnXztsw\nDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQUFAAOCAQEAlGsDY0EPu3NBSH5k6iw/\nwJh9e3xMwS17ErKGlhyWogxJMzLjAN6g0aCPHxB40IQC+8qAl+RL7VQx6oxttf0m\n31yUGQPcNYbt2CxBTCAr885oLK5t2TAi5tQzhd6ZEYihWSUWUd/X8BQRouxboss9\nQbBA/iIx0OpDaxiAcq7Cb67TheXZDxGuQ8fmHYbLx84pEvm3DQOB/LIMkkpQSfEC\n1f+oP1zB3urPU/dSvED/LCgOdrpxZ5di7SwSyue+Vq/TZQy34tPygEzD2d8hFlh/\nyfhWkMizOeIXcayVAQdNn5zpBkuay1skGOjQQ5kTbDcDzigO2R2rqn6HCd9l5Z0W\nIQ==", 4));
                Signature signature2 = packageInfo.signatures[0];
                if (!signature2.equals(signature)) {
                    if (z) {
                        if (signature2.equals(new Signature(Base64.decode("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\ncQ91Xms=", 4))) || signature2.equals(new Signature(Base64.decode("MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYD\nVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4g\nVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UE\nAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAe\nFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzET\nMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4G\nA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9p\nZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZI\nhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR\n24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVy\nxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8X\nW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC\n69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexA\ncKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkw\nHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0c\nxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UE\nCBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMH\nQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAG\nCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1Ud\nEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrP\nzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXcla\nXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05a\nIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+a\nayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUW\nEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs=", 4)))) {
                            return;
                        }
                        if (Log.isLoggable("CAR.PKGVERIFIER", 3)) {
                            Log.d("CAR.PKGVERIFIER", String.valueOf(str).concat(" not signed with valid release or debug cert."));
                        }
                    }
                    String str2 = Build.TYPE;
                    throw new SecurityException(str + " is not signed by Google or is not allowed on this device type " + str2 + " Will not load code from it.");
                }
                return;
            }
            int length = packageInfo.signatures.length;
            throw new SecurityException("Package has too many signatures (expected 1, found " + length + ")");
        }
        throw new IllegalArgumentException("Unexpected package name ".concat(String.valueOf(str)));
    }
}
