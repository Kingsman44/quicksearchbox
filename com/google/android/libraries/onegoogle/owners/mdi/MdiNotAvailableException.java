package com.google.android.libraries.onegoogle.owners.mdi;

/* compiled from: PG */
class MdiNotAvailableException extends Exception {

    /* compiled from: PG */
    final class ApiNotConnectedException extends MdiNotAvailableException {
        public ApiNotConnectedException() {
        }

        public ApiNotConnectedException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: PG */
    final class DeveloperErrorException extends MdiNotAvailableException {
        public DeveloperErrorException() {
        }

        public DeveloperErrorException(Throwable th) {
            super(th);
        }
    }

    protected MdiNotAvailableException() {
    }

    protected MdiNotAvailableException(Throwable th) {
        super(th);
    }
}
